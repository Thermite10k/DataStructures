package LinkedList;


import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        
    }
    
    private Node first;
    private Node last;
    private int size;

    // addFirst
    public void addFirst(int item){
        var node = new Node(item);
        if(first == null){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
        size++;
    }
    
    // addLast
    public void addLast(int item){
        var node = new Node(item);

        if(first == null){
            first = last = node;
            
        }else{
            last.next = node;
            last=node;
        }
        size++;
        
    }
    // delFirsts

    public void deleteFirst(){
        if (first== null ){
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
            
        }else{

            var second = first.next;
            first.next = null; //remove the link
            
            first = second;
        }
            size--;
            


        
    }
    // delLast

    private Node getPrev(Node node){

        var current = first;
        while(current != null){
            if(current.next == node) return current;
            current = current.next;
        }

        return null;

    }

    public void delLast(){
        if (first== null ){
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
            size--;

           
        }else{

            var prev = getPrev(last);
            last = prev;
            last.next = null;
        }
        
        

        size--;



    }
    // contains
    public boolean contains(int item){
        // var current = first;
        // while(current != null){
        //     if(current.value == item) return true;
        //     current = current.next;
        // }

        // return false;
        // return indexOf(item) >= 0 ? true : false;
        return indexOf(item) != -1;
    }
    // indexOf
    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current != null){
            if(current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while(current != null){
           array[index++] = current.value;
           current = current.next;

        }

        return array;
    }

    public void reverse(){
       
       var current = first;
       var next = first.next;
       var copy = first;

       
       // [1 -> 21 -> 4 ->6]
       
       while(next != null){
        copy = next.next;
        next.next = current;
        current = next;
        next = copy;

       }
       last = first;
       first.next = null;
       first= current;
        
        
        
    }

    public int KthfromEndFirstMethod(int k){
        if(k <= size){
            
            int index;
            var current = first;
            index = size - k;
            for(int i =0;i< index;i++){
               
                current = current.next;
            }
    
            return current.value;
        }else{
            return -1;
        }
    }

    public int KthfromEndSecondMethod(int k){
        if(k <=size){

            var second = first;
            var prev = first;
            
    
            int distance = k-1;
    
            //[ a b c d]
            // 4=> d = 3 => second = d, prev = a;
    
            while(second.next != null){
                second = second.next;
                if(distance <=0){
                    prev = prev.next;
                }
                distance--;
                
                
                
            }
            return prev.value;
        }else{
            return -1;
        }


        
    }
}
