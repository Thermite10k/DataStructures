package HashTables;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        // FirstRepeated analyzer = new FirstRepeated();
        // System.out.println(FirstNoneRepeatedChar("a green apple"));
        // System.out.println(firstTimeNoRep("a"));
        // System.out.println(analyzer.getFirsetRepeted("a green"));
        // System.out.println(analyzer.getFirsCharacterSE("a green"));

        HashFromScratch hashTable = new HashFromScratch();
        hashTable.put(4, "Value");
        hashTable.put(9, "Value2");
        hashTable.put(4, "Value3");
        System.out.println(hashTable.get(4));
        System.out.println(hashTable.get(9));
        hashTable.remove(12);
        System.out.println(hashTable.get(4));

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


        return Character.MIN_VALUE;

    }
    public static Character firstTimeNoRep(String input){
        Map<Character, Integer> firstIndex = new HashMap<>();
        for(var ch: input.toCharArray() ){
            // if(!(firstIndex.containsKey(ch))){
            //     firstIndex.put(ch,1);
            // }else{
            //     Integer count = firstIndex.get(ch);
            //     firstIndex.put(ch,count++);

                
            // }
            var count = firstIndex.containsKey(ch) ? firstIndex.get(ch) : 0;
            firstIndex.put(ch, count +1);
        }

        

        for(Character single:input.toCharArray()){
            Integer count = firstIndex.get(single);
            if(count ==1){
                return single;
            }
        }

        return Character.MIN_VALUE;
    }
}
