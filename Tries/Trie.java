package Tries;

public class Trie {
    private class Node{
        private Character value;
        private boolean isEndOfWord;
        private Node[] children = new Node[26];
         public Node(Character ch){
            this.value = ch;
         }
    }

    private Node root = new Node(null);

    private Integer indexOfCh(Character ch){
        return ch - 'a';
    }

    public void add(String input){
        Node current  = root;
        int len = input.length();
        for(Character ch :input.toCharArray()){
            int index = indexOfCh(ch);
            if(current.children[index] == null){
                current.children[index] = new Node(ch);
            }
            current = current.children[index];
            len--;
            if(len == 0){
                current.isEndOfWord = true;
                return;
            }
            

            
        }
    }
}
