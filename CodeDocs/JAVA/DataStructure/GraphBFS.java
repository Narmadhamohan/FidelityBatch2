import java.util.*;

class GraphBFS {
    private int numVertices; // Number of vertices
    private LinkedList<Integer>[] adjList; // Adjacency list

    // Constructor
    GraphBFS(int vertices) {
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

    // BFS algorithm
    void BFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (queue.size() != 0) {
            startVertex = queue.poll();
            System.out.print(startVertex + " ");

            // Get all adjacent vertices of the dequeued vertex
            for (int adjacent : adjList[startVertex]) {
                if (!visited[adjacent]) {
                    visited[adjacent] = true;
                    queue.add(adjacent);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("Breadth-First Traversal starting from vertex 0:");
        graph.BFS(0); // Starting BFS traversal from vertex 0
    }
}
