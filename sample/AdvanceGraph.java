import java.util.*;
public class AdvanceGraph {
    static class graph{
        private Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
        public void addEdge(int u, int v){
            adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            adjList.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
        }
        public void printGraph(){
            for(int node : adjList.keySet()){
                System.out.println("Node"+ node + " is connected to: " + adjList.get(node));
                for(int neighbor : adjList.get(node)){
                    System.out.println("Edge between " + node + " and " + neighbor);
                }
                System.out.println(); // Add a newline for readabilit
            }
        }
    }
    public static void main(String[] args) {
        graph g = new graph();
        
        
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(1, 4);
        g.printGraph();
    }
}
