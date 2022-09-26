package Tries;



public class Main {
    public static void main(String[] args){
        TrieWithhasMap trie = new TrieWithhasMap();
        trie.add("care");
        trie.add("car");
        trie.add("cat");
        trie.add("card");
        trie.add("cards");
        trie.add("castle");

        
        
        System.out.println(trie.findWords("cas"));
        
        
    }
}
