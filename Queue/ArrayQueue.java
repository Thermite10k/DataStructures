package Queue;

import javax.print.attribute.Size2DSyntax;

public class ArrayQueue {
    private int[] array;
    private int front = 0;
    private int rear = 0;
    private int items = 0;

    public ArrayQueue(int capacity){
        array =  new int[capacity]; 
    }

    public void enqueue(int item){
        if (items == array.length){
            throw new IllegalStateException();
        }
        array[rear] = item;
        rear = (rear+1)%array.length;
        items++;
        
        
        
    }

    public int dequeue(){
            int frontItem = array[front];
                array[front] = 0;
                front = (front +1 ) % array.length;
                items--;
            return frontItem;
        
    }

    public int peek(){
        return array[front];
    }

    public boolean isEmpty(){
        return items ==0;
    }
    public int[] show(){
        // int[] tempArr = new int[items];
        // int itterator = 0;
        // for(int i = front; i< rear ;i++){

        //     tempArr[itterator++] = array[i];
            

        // }
        // return tempArr;

        return array;
    }
    // enqueue
    // dequeue
    // peek
    // isEmpty/Full

}
