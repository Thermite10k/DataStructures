package Stacks;



public class Main {
    public static void main(String[] args){
        String word = "<>{}[[[]]]]]]]]]]]]]";
        StringReverser reverser = new StringReverser();
        Ballanced ballanced = new Ballanced();

        
        System.out.println(ballanced.isBallanced(word));

    }
}
