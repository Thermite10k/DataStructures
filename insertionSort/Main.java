package insertionSort;

import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        long startTime = System.nanoTime();
    

        insertionSort sorter = new insertionSort();
        int[] array =  {1,5,8,2,3,8,455,85846,384,3874,384,68,74};
        sorter.sorrt2(array);
        long endTime = System.nanoTime();

        System.out.println((endTime - startTime));
    }
}