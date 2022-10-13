package QuickSort;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        int[] array = {54,53,5325,464,54,546,4};
    
        quickSort sorter = new quickSort();
    
        sorter.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
