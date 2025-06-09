// BFS - Breadth First Search
// BFS is also called level order traversal
//It means exploring a graph checking all your closest friends first then their friends and so on

import java.util.*;
public class BFS {

    public static void main(String[] args) {
        Map<String, List<String>> house = new HashMap<String,List<String>>();
        house.put("Living Room", Arrays.asList("Kitchen", "Bedroom"));
        house.put("Kitchen",Arrays.asList( "Bathroom"));
        house.put("Bedroom", Arrays.asList("Balcony"));
        house.put("Study Room", new ArrayList<String>());
        house.put("Bathroom", new ArrayList<String>());
        house.put("Balcony", new ArrayList<String>());

        System.out.println("Exploring the house using BFS starting from living room : ");
        bfs(house, "Living Room");
    }

    public static void bfs(Map<String, List<String>> house, String start){
        Queue<String> queue = new LinkedList<String>();
        Set<String> visited = new HashSet<>();

        queue.add(start);
        visited.add(start);

        while(!queue.isEmpty()){
            String currentRoom = queue.poll();
            System.out.println("Visited: " + currentRoom);

            for(String neighbor : house.get(currentRoom)){
                if(!visited.contains(neighbor)){
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
}