package Graphs;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import Queue.StackQueue;

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

    public void depthFirstTraverse(String root){
        Node node = nodes.get(root);
        if(node == null){
            return;
        }
        
        depthFirstTraverse(node, new HashSet<>());
        

    }

    private void depthFirstTraverse(Node root, Set<Node> visited){

        System.out.println(root);
        visited.add(root);
        for(Node node: adjacencyList.get(root)){
            if(!visited.contains(node)){
  
                depthFirstTraverse(node,visited);
            }
        }

    }

    public void bredthFirstTraverse(String root){
        Node node = nodes.get(root);
        if(node == null){
            return;
        }
        bredthFirstTraverse(node, new HashSet<>());
    }

    private void bredthFirstTraverse(Node root, Set<Node> visited){
        visited.add(root);

        for(Node node: adjacencyList.get(root)){
            if(!visited.contains(node)){
                bredthFirstTraverse(node, visited);
            }
        }
        System.out.println(root.label);
    }

    public void depthFirstTraverseIterative(String root){
        Node rootNode = nodes.get(root);
        if(rootNode == null){
            return;
        }
        Set<Node> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();
        
        stack.push(rootNode);
        while(!stack.isEmpty()){
            Node current = stack.pop();
            if(visited.contains(current)){
                continue;
            }

            System.out.println(current.label);
            visited.add(current);

            for(Node neighbour : adjacencyList.get(current)){
                if(!visited.contains(neighbour));
                stack.push(neighbour);
            }
        }
    }

    public void bredthFirstTraverseIterative(String root){
        Node rootNode =  nodes.get(root);
        
        if(rootNode == null){
            return;
        }
        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque<>();
    

        queue.add(rootNode);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(visited.contains(current)){
                continue;
            }
            System.out.println(current);
            visited.add(current);
            for(Node edges : adjacencyList.get(current)){
                if(!visited.contains(edges)){

                    queue.add(edges);
                }
            }
        }
    }

    public List<String> topologiclSort(){
        
        Set<Node> visited = new HashSet<>();
        Stack<Node> stack = new Stack<>();



        for(Node node : nodes.values()){

            topologiclSort(node, visited,stack);
        }


        List<String> sorted = new ArrayList<>();
        while(!stack.isEmpty()){
            sorted.add(stack.pop().label);
        }
        return sorted;

    }

    private void topologiclSort(Node node, Set<Node> visited,Stack<Node> stack){
        
        if(visited.contains(node)){
            return;
        }
        
        visited.add(node);


        for(Node children : adjacencyList.get(node)){
            if(!visited.contains(children)){
                
                topologiclSort(children, visited,stack);
        

            }
        }
        stack.push(node);
      

    }

    public boolean hasCycle(){
        Set<Node> all = new HashSet<>();
        all.addAll(nodes.values());
        Set<Node> visiting = new HashSet<>();
        Set<Node> visited = new HashSet<>();

        while(!all.isEmpty()){
            //var current = all.toArray(new Node[0])[0];
            var current = all.iterator().next();
            if(hasCycle(current,all,visiting,visited)){
                return true;
            }
        }
        return false;

       
        
    }

    private boolean hasCycle(Node node, Set<Node> all,Set<Node> visiting,Set<Node> visited){
        all.remove(node);
        visiting.add(node);


        for(Node child : adjacencyList.get(node)){
            if(visited.contains(child)){
                continue;
            }

            if(visiting.contains(child)){
                return true;
            }

           
           if(hasCycle(child, all, visiting, visited)){
            return true;
           }
        }

        visiting.remove(node);
        visited.add(node);
        return false;
    }
}
