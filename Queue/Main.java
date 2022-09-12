package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);
        System.out.println(queue);
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
