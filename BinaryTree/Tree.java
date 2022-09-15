package BinaryTree;

import java.util.ArrayList;

public class Tree {
    private class Node{
        private int value;
        private Node rightChild;
        private Node leftChild;
        public Node(int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return "node= " + value;
        }
    }
    private Node root;

    public void add(int value){
        Node newNode = new Node(value);
        if(root == null){
            root = newNode;
            return;
        }
        Node currentNode = root;
        while(true){
            if(value > currentNode.value){
                if(currentNode.rightChild == null){
                    currentNode.rightChild = newNode;
                    break;
                }
                currentNode = currentNode.rightChild;
            }else if(value < currentNode.value){
                if(currentNode.leftChild == null){
                    currentNode.leftChild = newNode;
                    break;
                }
                currentNode = currentNode.leftChild;
            }

        }
        
    }

    public boolean contains(int value){
        Node currentNode = root;
        if(currentNode != null){
            if(currentNode.value == value){
                return true;
            }
            while(currentNode != null){
                if(value > currentNode.value){
                    currentNode = currentNode.rightChild;
                    

                }else if(value < currentNode.value){
                    currentNode = currentNode.leftChild;
                    

                }
                else if(value == currentNode.value){
                    return true;
                }
            }

        }

        return false;
    }
    
    public void traversePreOrder(){
        traversePreOrder(root);
    }

    private void traversePreOrder(Node rootNode){
        //root (print)
        // left 
        // right
        if(rootNode == null){
            return;
        } 
        System.out.println(rootNode.value);
        traversePreOrder(rootNode.leftChild);
        traversePreOrder(rootNode.rightChild);
    }

    public void traversePostorder(){
        traversePostorder(root);
    }

    private void traversePostorder(Node rootNode){
        if(rootNode == null){
            return;
        }
        traversePostorder(rootNode.leftChild);
        traversePostorder(rootNode.rightChild);
        System.out.println(rootNode.value);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }

    private void traverseInOrder(Node rootNode){
        if(rootNode == null){
            return;
        }
        traverseInOrder(rootNode.leftChild);
        System.out.println(rootNode.value);
        traverseInOrder(rootNode.rightChild);
    }
    public int height(){
        return height(root);
    }

    private boolean isLeaf(Node node){
        return (node.rightChild == null && node.leftChild == null);
    }

    private int height(Node rootNode){
        if(root == null){
            return -1;
        }
        if(isLeaf(rootNode)){

            return 0;
        }

        return 1 + Math.max(height(rootNode.leftChild), height(rootNode.rightChild));
        
    }

    public int min(){
        return min(root);
    }

    private int min(Node rootNode){
        if(isLeaf(rootNode)){

            return rootNode.value;
        }
       int left = min(rootNode.leftChild);
       int right = min(rootNode.rightChild);
       return Math.min(Math.min(left, right), rootNode.value) ;
    }

    public int binaryTreeMin(){

        Node current = root;
        Node last = current;
        if(root != null){
            while(current != null){
                last = current;
                current = current.leftChild;
            }
            return last.value;
        }
        throw new IllegalStateException();
    }

    private boolean areEqual(Node first, Node second){
        if(first == null && second == null){
            return true;
        }

        if(first != null && second != null){
            return first.value == second.value
            && areEqual(first.leftChild, second.leftChild)
            && areEqual(first.rightChild, second.rightChild);
        }

        return false;
        
    }

    public boolean areEqual(Tree tree2){
        if (tree2 == null){
            return false;
        }
        return areEqual(root, tree2.root);
    }

    public boolean isValidBinarySerchTree(){
        return isValidBinarySerchTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }
    private boolean isValidBinarySerchTree(Node root,int min,int max){
        if(root == null){
            return true;
        }
        if(root.value < min || root.value > max){
            return false;
        }

        return 
        isValidBinarySerchTree(root.leftChild,min,root.value-1) 
        &&
        isValidBinarySerchTree(root.rightChild,root.value+1,max);
        

    }

    public ArrayList<Integer> getNodeAtDistance(int distance){
        ArrayList<Integer> list = new ArrayList<Integer>();
        getNodeAtDistance(distance,root,list);
        return list;
    }

    private void getNodeAtDistance(int distance, Node root,ArrayList<Integer> list){
        if(root == null){
            return;
        }
        if(distance == 0){
            list.add(root.value);
            
            return;
        }
        
        
        getNodeAtDistance(distance - 1, root.leftChild,list);
        getNodeAtDistance(distance - 1, root.rightChild,list);
        
        

    
    }

    public void traverseLevelOrder(){
        for(int i =0; i<= height(); i++){

            
            for(int value: getNodeAtDistance(i)){
                System.out.println(value);
            }
        }
    }

}
