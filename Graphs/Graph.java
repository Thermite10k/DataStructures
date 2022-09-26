package Graphs;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private class Node{
        private String label;

        public Node(String label){
            this.label = label;
        }
        @Override
        public String toString(){
            return label;
        }
    }

    private Map<String, Node> nodes = new HashMap<>();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();
    public void addNode(String label){
        Node node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to){
        Node fromNode = nodes.get(from);
        var toNode = nodes.get(to);

        if(fromNode == null || toNode == null){
            throw new IllegalStateException();
        }

        adjacencyList.get(fromNode).add(toNode);
        
    }

    public void show(){
        for(Node srcNode : adjacencyList.keySet()){
            List<Node> targtNodes = adjacencyList.get(srcNode);
            if(!targtNodes.isEmpty()){
                System.out.println(srcNode + " is connected to" + targtNodes);
            }
        }
    }

    public void removeNode(String label){
        Node node = nodes.get(label);
        if(node != null){
            for(Node src : adjacencyList.keySet()){
                adjacencyList.get(src).remove(node);
                
            }
            adjacencyList.remove(node);
            nodes.remove(node);
            return;
        }

        return;
    }

    public void removeEdgd(String from, String to){
        Node fromNode = nodes.get(from);
        Node toNode = nodes.get(to);

        if(fromNode != null || toNode != null){
            adjacencyList.get(fromNode).remove(toNode);
        }
        return; 
    }
}
