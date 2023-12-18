import java.util.*;
public class DirectedGraph {
    private Map<Integer, List<Integer>> adjacencyList;

    public DirectedGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(int source, int destination) {
        if (!adjacencyList.containsKey(source)) {
            addVertex(source);
        }
        if (!adjacencyList.containsKey(destination)) {
            addVertex(destination);
        }
        adjacencyList.get(source).add(destination);
    }

    public List<Integer> getAdjacentVertices(int vertex) {
        return adjacencyList.get(vertex);
    }

    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);

        System.out.println("Adjacent vertices of vertex 1: " + graph.getAdjacentVertices(1));
        System.out.println("Adjacent vertices of vertex 2: " + graph.getAdjacentVertices(2));
        System.out.println("Adjacent vertices of vertex 3: " + graph.getAdjacentVertices(3));
        System.out.println("Adjacent vertices of vertex 4: " + graph.getAdjacentVertices(4));
    }
}
    
