package BubbleSort;

import java.util.Arrays;

import ArrClass.Array;


public class Main {
    public static void main(String[] args){
        int[] array= {7,3,1,4,6,2,3};

        BubbleSort sorter = new BubbleSort();
        
        
        sort(array);
        

        
    }
    public static void sort(int[] array) {
        int length  = array.length;

        //n-1 comparisons.
        for(int i = length-1; i>0;i--){
            for(int index = 0;index < i;index++ ){
                //System.out.println(array[index] + "&" + array[index+1]);


                if(array[index] > array[index+1]){
                    swap(index, index+1, array);
                }
                
            }
        }

        System.out.println(Arrays.toString(array));

        
    }

    public static void swap(int first, int second, int[] array){

        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;

        
        
    }
}
