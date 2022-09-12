package Stacks;

import java.util.Stack;


public class StringReverser{

    private char[] opening = {'(','<','{','['};
    
    
    private char[] closing = {')','>','}',']'};
    public String Reverse(String input){
        Stack<Character> stack = new Stack<>();
        int length = input.length();
        String result = "";
        for(int i=0; i< length; i++){
            stack.push(input.charAt(i));
        }
        for(int i = 0; i<length;i++){
            result += stack.pop();
        }
        return result;
    }

    public String ReverserImproved(String input){
        if(input != null){

            Stack<Character> stack = new Stack<>();
            StringBuffer result =new StringBuffer();
    
            for(char ch : input.toCharArray()){
                stack.push(ch);
            }
            while(!stack.empty()){
                result.append(stack.pop());
            }
    
            return result.toString();
        }else{
            throw new IllegalArgumentException();
        }
    }

    private boolean eqChar(char a,char b){
        if(Character.compare(a,b) == 0){
            return true;
        }else{
            return false;
        }
    }
    private boolean eqBrackets(char a,char b){
        if(eqChar(a, opening[0])){
            if(eqChar(b, closing[0])){
                return true;
            }
        }
        if(eqChar(a, opening[1])){
            if(eqChar(b, closing[1])){
                return true;
            }
        }
        if(eqChar(a, opening[2])){
            if(eqChar(b, closing[2])){
                return true;
            }
        }
        if(eqChar(a, opening[3])){
            if(eqChar(b, closing[3])){
                return true;
            }
        }
        return false;
    }

    public boolean isBallanced(String input){
        Stack<Character> stack = new Stack<>();       
        char top ;

        for(char ch: input.toCharArray()){
            //private char[] opening = {'(','<','{','['};
            // private char[] closing = {')','>','}',']'};
            
            if(eqChar(ch, opening[0] )|| eqChar(ch, opening[1]) || eqChar(ch, opening[2]) || eqChar(ch, opening[3])){               
                stack.push(ch);
            }
            if(eqChar(ch, closing[0] )|| eqChar(ch, closing[1]) || eqChar(ch, closing[2]) || eqChar(ch, closing[3])){
                
                if(!stack.empty()){

                    top = stack.pop();;
                    if(!eqBrackets(top, ch)){
                        return false;
                    }
                }
            }
        }


        
        return stack.empty();
        
       
    }
}