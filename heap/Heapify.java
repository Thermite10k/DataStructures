package heap;

import javax.lang.model.type.ArrayType;

public class Heapify {

    public static void heapify(int[] array){
        int lastParent = array.length / 2 -1;
        for(int i = lastParent; i>=0 ;i--){
            validate(array,i);
        }

    }
    private static void validate(int[] array, int index){
        
        int largerChildindex= index;
        int leftChild = (index *2)+1;
        if(leftChild < array.length&& array[leftChild] > array[largerChildindex]){
           largerChildindex = leftChild;
        }

        int rightChild = (index *2)+2;
        if(rightChild < array.length&& array[rightChild] > array[largerChildindex]){
            largerChildindex = rightChild;

        }

        if(index == largerChildindex){
            return;
        }
        swap(array, index, largerChildindex);
        validate(array,largerChildindex);
    }
    private static void swap(int[] array,int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
