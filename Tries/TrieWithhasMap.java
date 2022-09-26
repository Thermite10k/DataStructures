package Tries;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TrieWithhasMap {
    private class Node{
        private Character value;
        private boolean isEndOfWord;
        private HashMap<Character, Node> children = new HashMap<>();
         public Node(Character ch){
            this.value = ch;
         }


        @Override
        public String toString(){
            return "value " + value;
        }

        public Boolean hasChild(Character ch){
            return children.containsKey(ch);
        }
        public void addChildren(Character ch){
            children.put(ch, new Node(ch));
        }

        public Node getChild(Character ch){
            return children.get(ch);
        }
        public Node[] getChildren(){
            return children.values().toArray(new Node[0]);
        }
        public boolean hasChildren(){
            return !children.isEmpty();
        }
        public void removeChild(char ch){
            children.remove(ch);
        }
    }

    private Node root = new Node(null);

    

    public void add(String input){
        Node current  = root;
       
        for(Character ch :input.toCharArray()){
      
            if(current.hasChild(ch) == false){
                current.addChildren(ch);
            }
            current = current.getChild(ch);
            

            
        }
        current.isEndOfWord = true;
    }

    public Boolean contains(String input){
        if(input == null){
            throw new IllegalStateException();
        }
        Node current = root;

        for(Character ch: input.toCharArray()){
            if(!(current.hasChild(ch))){
              
                return false;
            }
            current = current.getChild(ch);

        }
        return current.isEndOfWord;
    }

    public void traverse(){
        traverse(root);
    }

    private void traverse(Node root){
        for(Node child :root.getChildren()){
            traverse(child);
        }
        System.out.println(root.value);
    }

    public void remove(String input){
        if(input == null){
            return;
        }
        remove(root, input,0);
    }

    private void remove(Node root, String input,int index){
        if(index == input.length()){
            root.isEndOfWord = false;
 
            return; 
        }
        char ch = input.charAt(index);
        Node child = root.getChild(ch);
        if(child == null){
            return;
        }

        remove(child, input, index + 1);
        if(!child.hasChildren() && !child.isEndOfWord){
            root.removeChild(ch);
        }
    }


    private Node findLastNode(String prefix){
        if(prefix == null){
            return null;
        }
        Node current = root;
        for(Character ch:prefix.toCharArray()){
            Node child = current.getChild(ch);
            if(child == null){

            }
            current = child;
        }

        return current;
    }
    public List<String> findWords(String prefix){
        
        List<String> words = new ArrayList<>();
        Node lastNode = findLastNode(prefix);
        findWords(lastNode, prefix, words);

        return words;
    }

    private void findWords(Node root, String prefix, List<String> words){
        if(root == null){
            return;
        }
        if(root.isEndOfWord){
            words.add(prefix);
        }
        for(Node child : root.getChildren()){
            findWords(child, prefix+child.value, words);
        }
    }


}
