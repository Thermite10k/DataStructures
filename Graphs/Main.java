package Graphs;

public class Main {
    public static void main(String[] args){
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("b");
        graph.addNode("c");

        graph.addEdge("A", "b");
        graph.addEdge("A", "c");
        graph.addEdge("b", "c");

        graph.show();
        System.out.println("REMOVING");
        graph.removeNode("A");
        graph.show();
        graph.removeEdgd("b", "c");
        System.out.println("REMOVING");

        graph.show();


    }
}
