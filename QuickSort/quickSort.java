package QuickSort;

import java.util.Arrays;


public class quickSort {

    public void sort(int[] array){
        
        sort(array, 0, array.length-1);
    }
    private void sort(int[] array, int start,int end){
        if(start >= end) {
            return;
        }
        int pivotIndex = partition(array, start, end);

        sort(array,start,pivotIndex -1);
        sort(array,pivotIndex + 1,end);

    }

    private void swap(int[] array, int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex]  = temp;
    }

    private int partition(int[] array,int start,int end){
        int pivot = array[end];
        int boundary = start-1;

        for(int i = start; i<= end; i++){
            if(array[i] <= pivot){
                boundary++;
                swap(array, boundary, i);
            }
        }

        return boundary;
    }

     
}
