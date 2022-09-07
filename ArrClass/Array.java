package ArrClass;

public class Array {
    private int[] items;
    private int count;
    public Array(int length){

        items = new int[length];

    }

    public void insert(int item){
        
        if (items.length == count){
           
            int[] newItems = new int[count * 2];
            
            for (int i =0; i< items.length; i++){
                newItems[i] = items[i];
            }
            
            items = newItems;
        }
       

        items[count] = item;
        count++;
    }

    public void removeAt(int index){
        if (index < 0 || index >= count){
           
            
            throw new IllegalArgumentException();
        }
        // [0,1,5,8] c=4 len=3, ig=1 || 1 => [0,5,8,8ptr] => c-- [0,5,8prt,8]
        for(int i=index;i<count-1;i++){
            items[i] =items[i+1];
        }
        count--;
    }
    
    public int indexOf(int item){
        for (int i =0; i<count;i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }

    public void print(){
        
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }
}
