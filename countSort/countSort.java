package countSort;



public class countSort {

    private int[] items;
    
    public void sort(int[] array, int size){

       
        items = new int[size];

        for(int item : array){
            items[item-1] = items[item-1] +1;
        }

    

        int ptr = 0;

        for(int i=0; i<items.length;i++){
            int count = items[i];
            int value = i+1;

            if(count > 0){
                while( count > 0){
                    array[ptr] = value;
                    count--;
                    ptr++;
                }

            }
        }
    


        
    }
}
