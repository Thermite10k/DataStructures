package HashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeated {
    public Character getFirsetRepeted(String input){
        Map <Character, Integer> map = new HashMap<>();

        for(Character ch: input.toCharArray() ){
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
            if(map.get(ch) == 2){
                return ch;
            }
        }

        

        return 0;
    }

    public Character getFirsCharacterSE(String input){
        Set<Character> set = new HashSet<>();

        for(Character ch : input.toCharArray()){
            if(set.contains(ch))
                return ch;

            set.add(ch)  ;
        }

        return Character.MIN_LOW_SURROGATE;
    }
}
