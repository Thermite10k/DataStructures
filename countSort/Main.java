package countSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] array = {8,4,67,9,5,4,7,6,25,4,684,200,685,464};
    
        countSort sorter = new countSort();
    
        sorter.sort(array,685);

        System.out.println(Arrays.toString(array));
    }
}
