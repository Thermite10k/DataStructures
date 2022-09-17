package BinaryTree;

public class Main {

    public static void main(String[] args){
        Tree tree = new Tree();
        tree.add(7);
        tree.add(4);
        tree.add(9);
        tree.add(1);
        tree.add(6);
        tree.add(8);
        tree.add(10);

       
        // tree.traversePreOrder();
        // System.out.println("++++++++++++++++++++");
        // tree.traverseInOrder();
        // System.out.println("++++++++++++++++++++");

        // tree.traversePostorder();

        
        var list = tree.getNodeAtDistance(1);
        for(int value:list){
            System.out.println(value);
        }

        tree.traverseInOrder();
        
    }
    
}
