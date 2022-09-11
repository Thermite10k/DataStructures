package LinkedList;

import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        var list = new LinkedList();
        

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        int secondd = list.KthfromEndSecondMethod(3);
        int second = list.KthfromEndFirstMethod(3);
        

        //list.reverse();
        var arr1 = list.toArray();
        System.out.println(Arrays.toString(arr1));
        
        System.out.println(secondd);
        System.out.println(second );
        
        
    }
}