package SelectionSort;

import java.util.Arrays;


public class Main {
    public static void main(String[] args){
        SelectionSort sorter = new SelectionSort();
        int[] array = {7,3,1,5,2};

        sorter.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
