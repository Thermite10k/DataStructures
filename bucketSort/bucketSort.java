package bucketSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import SelectionSort.SelectionSort;

public class bucketSort {
    
    



    public void sort(int[] array, int numOfBuckets){
        int i = 0;
        for(List<Integer> buck : createBuckets(array, numOfBuckets)){
            Collections.sort(buck);

            for( int item : buck){
                array[i] = item;
                i++;
            }
            
        }
    }

    private List<List<Integer>> createBuckets(int[] array,int numOfBuckets){
        List<List<Integer>> bucket = new ArrayList<>();
        for(int i = 0; i< numOfBuckets ; i++){
            bucket.add(new ArrayList<>());
        }
        for(int item : array){
            bucket.get(item/numOfBuckets).add(item);

        }

        return bucket;
    }

    
    
}
