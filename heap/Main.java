package heap;

public class Main {
    public static void main(String[] args){
        Heap heap = new Heap(9);

        heap.add(15);
        heap.add(10);
        heap.add(3);
        heap.add(8);
        heap.add(12);
        heap.add(9);
        heap.add(4);
        heap.add(1);
        heap.add(24);
        heap.show();
        heap.remove(24);
        heap.show();
        heap.remove(15);
        heap.remove(10);
        heap.remove(3);
        heap.remove(8);
        heap.remove(12);
        heap.remove(9);
        heap.remove(4);
        heap.remove(1);
        heap.show();


    }
}
