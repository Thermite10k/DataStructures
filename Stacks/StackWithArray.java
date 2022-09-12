package Stacks;

public class StackWithArray {
    private int[] stack;
    private int top ;

    public StackWithArray(int length){
        stack = new int[length+1];
    }

    public void push(int item){
        stack[top] = item;
        top++;
    }
    public int pop(){
        int onTop = stack[top-1];
        top--;
        return onTop;

    }
    public int peek(){
        if(top == 0){
            throw new IllegalStateException();
        }
        return stack[top-1];
    }

    public boolean isEmpty(){
        return top ==0;
    }

    public int[] show(){
        int[] stackWithTop = new int[top];
        for(int i=0;i<top;i++){
            stackWithTop[i] = stack[i];
        }
        return stackWithTop;
    }
}
