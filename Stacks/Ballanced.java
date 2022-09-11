package Stacks;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Ballanced {
    
    private final List<Character> openings = Arrays.asList('(','<','{','[');
    private final List<Character> closings = Arrays.asList(')','>','}',']');

    private boolean isOpening(char input){
        return openings.contains(input);
    }
    private boolean isClosing(char input){
        return closings.contains(input);
    }

    private boolean areMatching(char a, char b){
        return openings.indexOf(a) == closings.indexOf(b);
    }

    public boolean isBallanced(String input){
        Stack<Character> stack = new Stack<>(); 
        for(char ch: input.toCharArray()){
            if(isOpening(ch)) stack.push(ch);
            if(isClosing(ch)){
                if(stack.empty()) return false;
                var top = stack.pop();
                if(!areMatching(top, ch)) return false;


            }
        }
        return stack.empty();
    }
}
