package heap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Heap heap = new Heap(9);

        int[] array ={5,3,8,4,1,2};

        System.out.println(Arrays.toString(heap.sortAscendig(array)));
        System.out.println(Arrays.toString(heap.sortDescending(array)));
        Heapify.heapify(array);
        System.out.println(Arrays.toString(array));
        


    }
}
