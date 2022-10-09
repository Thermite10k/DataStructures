package insertionSort;



public class insertionSort{
    public void sort(int[] array){
        for(int index = 1; index < array.length; index++){
            int last = array[index-1];
            if(last > array[index]){
                int temp = array[index];
                array[index] = last;
                array[index-1] = temp;
                sort(array);
            }
        }

        
    }

    public void sorrt2(int[] array){
        for(int i = 1; i< array.length;i++){
            int current = array[i];
            int j = i-1;

            while( j >=0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            
            array[j+1] = current;

        }
    }
}