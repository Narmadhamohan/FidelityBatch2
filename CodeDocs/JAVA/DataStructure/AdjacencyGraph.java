package com.datastructure.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdjacencyGraph {

    private Map<String , List<String>> adjMap;

    public AdjacencyGraph() {
        adjMap = new HashMap<>();
    }
    // Dijo, jose , Anto: cicle - intial vertex
    public void addVertex(String nameVertex) {
        adjMap.putIfAbsent(nameVertex, new ArrayList<>());
    }
    //Dijo connected to Anto
    public void addEdge(String nameVertex1, String nameVertex2) {
        adjMap.get(nameVertex1).add(nameVertex2);
        adjMap.get(nameVertex1).add(nameVertex2);

    }

public void printAdjacencyGraph() {
        for(String name : adjMap.keySet()) {
            System.out.println(name +" is connected to" );
            System.out.println(adjMap.get(name));
        }
}

    public static void main(String[] args) {
        AdjacencyGraph graph = new AdjacencyGraph();
        graph.addVertex("Dijo");
        graph.addVertex("Jose");
        graph.addVertex("Anto");

        graph.addEdge("Dijo", "Jose");
        graph.addEdge("Jose", "Anto");

        graph.printAdjacencyGraph();

    }

}
