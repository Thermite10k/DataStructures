package heap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Heap heap = new Heap(9);

        int[] array ={2,5,1,3,7,9,25,489,354,21,20};

        System.out.println(Arrays.toString(heap.sortAscendig(array)));
        System.out.println(Arrays.toString(heap.sortDescending(array)));
        


    }
}
