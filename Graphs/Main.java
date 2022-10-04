package Graphs;

public class Main {
    public static void main(String[] args){
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("X");
        graph.addNode("P");
        graph.addEdge("X", "B");
        graph.addEdge("X", "A");
        graph.addEdge("B", "P");
        graph.addEdge("A", "P");

       
      
        System.out.println(graph.hasCycle());
       


    }
}
