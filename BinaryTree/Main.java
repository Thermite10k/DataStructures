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

        Tree tree2 = new Tree();
        tree2.add(7);
        tree2.add(4);
        tree2.add(9);
        tree2.add(1);
        tree2.add(6);
        tree2.add(87);
        tree2.add(10);
        // tree.traversePreOrder();
        // System.out.println("++++++++++++++++++++");
        // tree.traverseInOrder();
        // System.out.println("++++++++++++++++++++");

        // tree.traversePostorder();

        System.out.println(tree.areEqual(tree2));
        
    }
    
}
