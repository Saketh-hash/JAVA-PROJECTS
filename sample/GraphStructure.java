// Graph Structure:
// Entrance connects to: Reptile House, Bird Sanctuary, Mammal zone
// Reptile House connects to: Snake Pit
// Bird Sanctuary connects to: Parrot Pavilion
// Mammal Zone connects to: Lion Den, Elephant enclosure
// All other have no further zones

import java.util.*;
public class GraphStructure {
    public static void bfs(Map<String, List<String>> house, String start){
        Queue<String> queue = new LinkedList<String>();
        Set<String> visited = new HashSet<String>();
        queue.add(start);
        visited.add(start);
        while(!queue.isEmpty()){
            String current = queue.poll();
            System.out.println("Visited: " + current);
            List<String> neighbors = house.get(current);
            for(String neighbor : neighbors){
                if(!visited.contains(neighbor)){
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
    public static void main(String[] args) {
        Map<String, List<String>> house = new HashMap<String, List<String>>();
        house.put("Entrance", Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
        house.put("Reptile House", Arrays.asList("Snake Pit"));
        house.put("Bird Sanctuary", Arrays.asList("Parrot Pavilion"));
        house.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclosure"));
        house.put("Snake Pit", new ArrayList<String>());
        house.put("Parrot Pavilion", new ArrayList<String>());
        house.put("Lion Den", new ArrayList<String>());
        house.put("Elephant Enclosure", new ArrayList<>());
        bfs(house, "Entrance");

    }
}
