package LinkedList;

import java.lang.management.ThreadInfo;
import java.util.Currency;
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

    // addFirst
    public void addFirst(int item){
        var node = new Node(item);
        if(first == null){
            first = last = node;
        }else{
            node.next = first;
            first = node;
        }
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
        
    }
    // delFirsts

    public void deleteFirst(){
        if (first== null ){
            throw new NoSuchElementException();
        }
        if (first == last){
            first = last = null;
            return;
        }
            var second = first.next;
            first.next = null; //remove the link
            
            first = second;
            


        
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
            return;
        }
        var prev = getPrev(last);
        
        

        last = prev;
        last.next = null;



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
}
