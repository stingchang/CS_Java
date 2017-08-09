package question_451;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q500_Keyboard_Row {

    public String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        init(map);
        
        List<String> list = new ArrayList<>();
        
        for(String s: words) {
            if(inSameRow(map, s))
                list.add(s);
        }
        
        return list.toArray(new String[0]);
    }
    
    private boolean inSameRow(Map<Character, Integer> map, String word){
        char[] arr = word.toLowerCase().toCharArray();
        int iniValue = map.get(arr[0]);
       
        for(int i = 1; i< arr.length; i++){
            if(iniValue != map.get(arr[i])){
                return false;
            }
        }
        
        return true;
    }
    
    private void init(Map<Character, Integer> map){
        // row 1
        map.put('x', 1);
        map.put('z', 1);
        map.put('c', 1);
        map.put('v', 1);
        map.put('b', 1);
        map.put('n', 1);
        map.put('m', 1);
        
        // row 2
        map.put('a', 2);
        map.put('s', 2);
        map.put('d', 2);
        map.put('f', 2);
        map.put('g', 2);
        map.put('h', 2);
        map.put('j', 2);
        map.put('k', 2);
        map.put('l', 2);
        
        // row 3
        map.put('q', 3);
        map.put('w', 3);
        map.put('e', 3);
        map.put('r', 3);
        map.put('t', 3);
        map.put('y', 3);
        map.put('u', 3);
        map.put('i', 3);
        map.put('o', 3);
        map.put('p', 3);
    }
}
