package bucketSort;

import java.util.Arrays;
public class Main {

    public static void main(String[] args){
        bucketSort sorter = new bucketSort();
        int[] array = {5,4,6,3,4};

        sorter.sort(array,3);

        System.out.println(Arrays.toString(array));
    }
    
}
