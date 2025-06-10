// DFS Implementation (30 points)
// Difficulty : Medium
// Implement a Depth First Search algorithm to find all people in the same social circle (connected components) as a given person.
// Requirements: 
// Use DFS to traverse the graph
// Return a list of all connected people
// Handle disconnected components as a given person
// Implement both recursive and iterative versions of DFS

// Method Signature:
// public List<String> findSocialCircle(String person)
// public List<String> findSocialCircleIterative(String person)

import java.util.*;
public class DFSImplementation{
    private Map<String, List<String>> connectedPeople = new HashMap<>();
    private Set<String> visited = new HashSet<>();
    public void addPerson(String person, String connectedPerson){
        connectedPeople.computeIfAbsent(person, k -> new ArrayList<>()).add(connectedPerson);
        connectedPeople.computeIfAbsent(connectedPerson, k -> new ArrayList<>()).add(person);
    }
    public List<String> findSocialCircle(String person){
        visited.clear();
        List<String> socialCircle = new ArrayList<>();
        dfs(person, socialCircle);
        return socialCircle;
    }
    private void dfs(String person, List<String> socialCircle){

        if (visited.contains(person)){
            return;
        }
        visited.add(person);
        socialCircle.add(person);
        for (String connectedPerson : connectedPeople.getOrDefault(person, Collections.emptyList())){
            dfs(connectedPerson, socialCircle);
        }
    }

    public List<String> findSocialCircleIterative(String person){
        visited.clear();
        List<String> socialCircle = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(person);
        while (!stack.isEmpty()){
            String currentPerson = stack.pop();
            if (!visited.contains(currentPerson)){
                visited.add(currentPerson);
                socialCircle.add(currentPerson);
                for (String connectedPerson : connectedPeople.getOrDefault(currentPerson, Collections.emptyList())){
                    stack.push(connectedPerson);
                }
            }
        }
        return socialCircle;
    }
    public static void main(String[] args) {
        DFSImplementation dfs = new DFSImplementation();
        dfs.addPerson("Alice", "Bob");
        dfs.addPerson("Bob", "Charlie");
        dfs.addPerson("David", "Eve");
        List<String> socialCircle = dfs.findSocialCircle("Charlie");
        System.out.println("Social Circle (Recursive): " + socialCircle);
        List<String> socialCircleIterative = dfs.findSocialCircleIterative("Charlie");
        System.out.println("Social Circle (Iterative): " + socialCircleIterative);

    }
}