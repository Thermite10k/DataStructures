package LinkedList;

public class Main{
    public static void main(String[] args){
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(2);
        list.addLast(100);
        System.out.println(list.contains(15));
        
    }
}