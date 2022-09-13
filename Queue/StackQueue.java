package Queue;


import java.util.Stack;
// the peek,end and first methods are bugged.
public class StackQueue{
    Stack<Integer> firstStack = new Stack<>();
    Stack<Integer> secondStack = new Stack<>();
    private int size = 0;

    //[10, 20, 30, 40, 50]

    private Stack<Integer> reverser(Stack<Integer> a){
        Stack<Integer> temp = new Stack<>();
        Stack<Integer> copy = a;

        if(!copy.empty()){
            while(!copy.empty())
                temp.push(copy.pop());
            
            return temp;

        }else{
            throw new IllegalStateException();
        }
    }

    public void enqueue(int item){
        firstStack.push(item);
        
        size++;
    }

    public int dequeue(){
        if(size > 0){
            if(secondStack.empty()){
                while(!firstStack.empty()){
                    secondStack.push(firstStack.pop());
                }
            }

            return secondStack.pop();

            
                    
        } else {
            throw new IllegalStateException();
        }

    }

    public int peek(){
        if(size > 0){
            if(secondStack.empty()){
                while(!firstStack.empty()){
                    secondStack.push(firstStack.pop());
                }
            }

            return secondStack.peek();

            
                    
        } else {
            throw new IllegalStateException();
        }
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int front(){
        if(size >0){
            return secondStack.peek();

        }else {
            throw new IllegalStateException();
        }
    }
    public int back(){
        if(size > 0){

            return firstStack.peek();
        }else{
            throw new IllegalStateException();
        }
    }

    public void show(){
        System.out.println(firstStack.empty() == true? reverser(secondStack) : firstStack);
    }
}