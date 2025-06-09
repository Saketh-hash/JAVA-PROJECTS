import java.util.*;
public class DFS {
    private Map<String, List<String>> homeMap = new HashMap<String, List<String>>();
    private Set<String> visited = new HashSet<String>();

    public void addRoom(String room, String connectedRoom){
        homeMap.computeIfAbsent(room, k -> new ArrayList<>()).add(connectedRoom);
        homeMap.computeIfAbsent(connectedRoom, k -> new ArrayList<>()).add(room);
    }

    public void dfs(String currentRoom){
        if (visited.contains(currentRoom)){
            return;
        }
        visited.add(currentRoom);
        System.out.println("Visited: " + currentRoom);

        for(String neighbor : homeMap.get(currentRoom)){
            dfs(neighbor);
        }
    }
    public static void main(String[] args) {
        DFS home = new DFS();
        home.addRoom("Living Room", "Kitchen");
        home.addRoom("Living Room", "Bedroom");
        home.addRoom("Bedroom", "Bathroom");

        System.out.println("DFS Traversal starting from Living Room: ");
        home.dfs("Living Room");

    }
}
