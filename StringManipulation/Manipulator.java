package StringManipulation;

import java.util.Arrays;
import java.util.Collections;

import java.util.Stack;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public  class Manipulator {
    public int numOfVowels(String input){

        if(input == null)
            return 0;
        int count = 0;
        String vowels = "aieou";
        for(Character ch : input.toLowerCase().toCharArray()){
            if(vowels.contains(Character.toString(ch)))
                count++;

            
            }
        
        return count;
    }

    public String reverseCharacters(String input){
        String results = "";
        Stack<Character> stack = new Stack<>();
        for(Character ch : input.toCharArray()){
            stack.push(ch);
        }

        while(!stack.isEmpty()){
            results = results + stack.pop();
        }
        
        return results;
    }

    public String reverseStr(String input){
        String results = "";
        Stack<String> stack = new Stack<>();

        String[] words = input.split(" ");
        for(String str : words){
            stack.push(str);
        }
        while(!stack.isEmpty()){
            String popped = stack.pop();
            results = results + popped;
            if(!stack.isEmpty())
                results += " ";
        }
        return results;
    }

    public String reverseStr2(String input){
        String[] words = input.split(" ");
        String results = "";
        for(int i = words.length-1; i >=0; i--){
            results = results + words[i] + " ";
        }

        return results.trim();
    }

    public String reverseStr3(String input){
        String[] words = input.split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    

    public Boolean areRotations(String input1, String input2){
    char[] arr1 = input1.toCharArray();
    char[] arr2 = input2.toCharArray();

  
    int maxIndex = arr1.length;
    char firstArrEl = arr1[0];
    int shiftAmount = 0;
    for(char ch : arr2){

        if(ch == firstArrEl){
            break;
        }
        shiftAmount++;
    }

    
    for(int i = 0; i< maxIndex ; i++){
        int SHAMT  = ( i+shiftAmount) % maxIndex;
        if(arr1[i] != arr2[SHAMT]){
            return false;
        }
    }
    return true;
    }
}
