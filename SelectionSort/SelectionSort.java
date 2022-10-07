package SelectionSort;

public class SelectionSort {
    public void sort(int[] array){
        for(int i = 0; i< array.length; i++){
            
            int min = i;
            for(int j = i; j< array.length; j++){
                if(array[j]< array[min]){
                
                    min = j;
                    
                }


            }
            swap(array, min, i);

        }
    }
    private void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
