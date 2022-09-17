package AVLTree;

public class AVLTree {
    private class Node{
        private int value;
        private Node rightChild;
        private Node leftChild;
        private int height;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "node Value " + value;
        }
    }

    private Node root;

    public void add(int item){
        Node newNode  = new Node(item);
        
        root = add(newNode,root);
    }

    private Node add(Node newNode,Node root){
        if(root == null){
            return newNode;
            
        }
        if(newNode.value > root.value){
            
          root.rightChild =   add(newNode, root.rightChild);
        } else if(newNode.value < root.value){
            
           root.leftChild =  add(newNode, root.leftChild);
        }

        setHeight(root);
        
        

        return ballance(root);


    }

    private Node ballance(Node root){
        
        if (isLeftHeavy(root)){
           if(ballanceFactor(root.leftChild)  < 0){
           root.leftChild = leftRotate(root.leftChild);
           
           }
           return rightRotate(root);
        }else if (isRightHeavy(root)){
            if(ballanceFactor(root.rightChild) > 0){
               root.rightChild =  rightRotate(root.rightChild);
            }
            return leftRotate(root);
            }

            return root;
        
    }

    private boolean isRightHeavy(Node root){
        return ballanceFactor(root) < -1 ? true : false;
    }

    private boolean isLeftHeavy(Node root){
        return ballanceFactor(root) > 1 ? true : false;

    }

    private int ballanceFactor(Node root){
        return (root == null) ? 0 :   height(root.leftChild) - height(root.rightChild);
        

    } 

    private int height(Node node){
        return (node ==  null) ? -1 : node.height;
    }

    //10
    //  20
    //    30

    private void setHeight(Node node){
        node.height= Math.max(height(node.leftChild),height(node.rightChild)) +1;
    }
    private Node leftRotate(Node root){
        
        Node newRoot = root.rightChild;
   
        root.rightChild = newRoot.leftChild;
        
        newRoot.leftChild = root;
        setHeight(root);
        setHeight(newRoot);
        
        return newRoot;
    }

    private Node rightRotate(Node root){
        Node newRoot = root.leftChild;
        
        root.leftChild = newRoot.rightChild;
        
        newRoot.rightChild = root;
        setHeight(root);
        setHeight(newRoot);
        
        return newRoot;
    }
}
