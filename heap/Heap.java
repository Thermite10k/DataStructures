package heap;

import java.util.Arrays;


public class Heap {
    private int[] array;
    private int items;
    public Heap(int size){
        array = new int[size];
    }

    public void add(int input){
        if(array[0] == 0){
            array[items] = input;
            items++;
        }else{
            array[items] = input;
            items++;
        }
        isValid();



        // leftChild = 2i + 1 : rightChild = 2i+ 2
    }

    

    private void isValid(){
        int i;
        int errorIndex = -1;
        for( i =0; 2*i<items-1; i++){
            if(array[(2*i )+1] > array[i] || array[(2*i) + 2] > array[i]){
                
                errorIndex = i;
                
                int rightChildIndex = (2*i) + 2;
                int leftChildIndex = (2*i) + 1;

                if(array[leftChildIndex] > array[i]){
                    int temp = array[i];
                    array[i] = array[leftChildIndex];
                    array[leftChildIndex]=temp;

                }else if (array[rightChildIndex] > array[i]){

                    int temp = array[i];
                    array[i] = array[rightChildIndex];
                    array[rightChildIndex]=temp;
                }
                


                
            }
        }
        //check to see if new bubbled value is smaller than parent
        
        if(errorIndex != -1 && errorIndex > 0){

            if(errorIndex%2 ==0){
                int parent = array[(errorIndex - 2) / 2];
                if(array[errorIndex] > parent){
                    isValid();
                }
            } else if(errorIndex%2 == 1){
                int parent = array[(errorIndex - 1) / 2];
                if(array[errorIndex] > parent){
                    isValid();
                }
    
            }
        }
        
    }

    public void remove(int input){
        if(input > 0){

            for(int i =0; i< items;i++){
                if(array[i] == input){
                    array[i] = array[items-1];
                    array[items-1] = 0;
                    items--;
                }
            }
            isValid();
            
        }
    }

    public int remove(){
        if(items > 0){
            int toBeReturned = array[0];
            array[0] = array[items-1];
            array[items-1] = 0;
            items--;
            isValid();

            return toBeReturned;
        }
        throw new IllegalStateException();

    }

    public boolean isEmpty(){
        return items == 0;
    }

    public void show(){
        System.out.println(Arrays.toString(array));
    }

    private Heap addToArrya(int[] input){
        Heap heap = new Heap(input.length+1);
        for(int i = 0; i<input.length;i++){
            heap.add(input[i]);
        }
        return heap;
    }

    public int[] sortAscendig(int[] input){
        Heap heap  = addToArrya(input);
        int[] array = new int[input.length];
        
        while(!(heap.isEmpty())){
            for(int i=0;i<input.length;i++){
                array[i] = heap.remove();
            }
        }

        return array;
    }

    public int[] sortDescending(int[] input){
        Heap heap  = addToArrya(input);
        int[] array = new int[input.length];
        
        while(!(heap.isEmpty())){
            for(int i=input.length -1;i>=0;i--){
                array[i] = heap.remove();
            }
        }

        return array;
    }


}
