package mergeSort;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] array = {1,56,4768,5648,6476,4687,654,48,6,468,76,8};

        mergeSort sorter = new mergeSort();
        sorter.sort(array);
        System.out.println("DOne");

        System.out.println(Arrays.toString(array));

    }
}