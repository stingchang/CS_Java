package question_001;

import java.util.*;

public class Q049_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // creat a list that contains lists of anagrams
        List<List<String>> lists = new ArrayList<>();
        // a map that stores anagramKey and location in the list
        Map<String, Integer> map = new HashMap<>();

        for (String s : strs) {
            String key = genKey(s);
            int index = map.containsKey(key) ? map.get(key) : lists.size();
            if (index == lists.size()) {
                List<String> list = new ArrayList<>();
                list.add(s);
                lists.add(list);
            } else {
                lists.get(index).add(s);
            }
            map.put(key, index);
        }

        return lists;
    }

    // for each string, return its anagram that all characters sorted ascendingly
    public String genKey(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (char c : arr) {
            sb.append(c);
        }
        String key = sb.toString();
        //System.out.println(str+" : "+key);
        return key;
    }
}
