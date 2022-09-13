package HashTables;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        
        System.out.println(FirstNoneRepeatedChar("a green apple"));
    }

    public static Character FirstNoneRepeatedChar(String input){
        Map<Character, Integer> firstIndex = new HashMap<>();
        Map<Character, Integer> lastIndex = new HashMap<>();
        input = input.replaceAll(" ","");
        int i = 0;
        for(Character ch : input.toCharArray()){
            lastIndex.put(ch, i);
            

            if(!(firstIndex.containsKey(ch))){

                firstIndex.put(ch, i);
                
            }

                


            i++;
        }

        System.out.println(firstIndex);
        System.out.println(lastIndex);
        Map<Integer, Character> single = new HashMap<>();
        
        for(var first:firstIndex.entrySet()){
            for(var last: lastIndex.entrySet()){
                if(first.getValue() == last.getValue()){
                    single.put(first.getValue(),first.getKey());
                    
                }
            }
        }
        for(var first:single.entrySet()){
            return first.getValue();
        }


        return 'n';
    }
}
