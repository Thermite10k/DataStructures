package Queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        // Queue<Integer> queue = new ArrayDeque<>();
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // reverse(queue);
        // System.out.println(queue);

        ArrayQueue arrQueue = new ArrayQueue(3);
        StackQueue  stackQueue = new StackQueue();
        
        stackQueue.enqueue(10);
        stackQueue.enqueue(20);
        stackQueue.enqueue(30);

        
        stackQueue.show();
        stackQueue.dequeue();
        stackQueue.show();

        stackQueue.dequeue();
        stackQueue.show();

        stackQueue.dequeue();
        stackQueue.show();


       
        
     }

    public static void reverse(Queue<Integer> queue){
        
        Stack<Integer> tempStack = new Stack<>();

        while(!queue.isEmpty()){
            tempStack.push(queue.remove());
        }
        while(!tempStack.isEmpty()){
            queue.add(tempStack.pop());
        }

        
        // add
        // remove
        // isEmpty
    }
}
