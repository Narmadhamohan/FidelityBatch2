import java.util.*;

class GraphDFS {
    private int numVertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    // Constructor
    GraphDFS(int vertices) {
        numVertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    void addEdge(int src, int dest) {
        adjList[src].add(dest);
    }

    // DFS algorithm
    void DFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        DFSUtil(startVertex, visited);
    }

    // Utility method for DFS
    void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        // Recur for all the adjacent vertices
        for (int adjacent : adjList[vertex]) {
            if (!visited[adjacent]) {
                DFSUtil(adjacent, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("Depth-First Traversal starting from vertex 0:");
        graph.DFS(0); // Starting DFS traversal from vertex 0
    }
}
