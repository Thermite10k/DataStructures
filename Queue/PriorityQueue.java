package Queue;

import java.util.Arrays;

public class PriorityQueue {
    private int[] array;
    private int size = 0;

    public PriorityQueue(int size){
         array = new int[size];
    }

    public void add(int item){
        
        // [1,3,4,5,0,0,].add(2);
        if(!( size >= array.length)){

            if(size > 0){
                for(int i = size-1; i >=0; i--){
                    if(i>0&&array[i] >= item){
                        array[i + 1] = array[i];
                        
    
                    }else if(i>0&&array[i] < item){
                        array[i+1]= item;
                        break;
    
                    }else if(i == 0 && array[i] > item){
                        array[i + 1] = array[i];
    
                        array[i] = item;
                        break;
                    }else if (i==0 && array[i] < item){
                        array[i+1] = item;
                        break;
    
                    }
                }
            }else if (size == 0){
                array[size] = item;
            }
            size++;
        }else{
            throw new IllegalStateException();
        }
    }

    public Integer remove(){
        
        if(size > 0){
            int head = array[0];
        //sr [2, 1, 2 ,3]
            for (int i =0;i<size;i++){
                if(i !=size-1)
                    array[i] = array[i+1];
                else if(i == size-1)
                    array[i] = 0;   
        }
            size--;
            return head;
        }else{
            throw new IllegalStateException();
        }

        
    }

    public boolean isEmpty(){
        return size ==0;
    }

    public boolean isFull(){
        return size == array.length;
    }

    public String show(){
        return Arrays.toString(array);
    }
}
