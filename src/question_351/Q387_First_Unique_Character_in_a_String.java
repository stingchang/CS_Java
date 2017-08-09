package question_351;

public class Q387_First_Unique_Character_in_a_String {
    public int firstUniqChar(String s) {
        // Set<Character> first = new HashSet<>();
        // Set<Character> second = new HashSet<>();
        // char[] arr = s.toCharArray();
        // for(char c: arr) {
        //     if(first.contains(c)){
        //       second.add(c); 
        //     }
        //     first.add(c);
        // }
        
        // for(int i = 0; i< arr.length; i++){
        //     if(!second.contains(arr[i]))
        //         return i;
        // }
        
        int[] chars = new int[26];
        char[] arr = s.toCharArray();
        for(char c : arr){
            chars[c - 'a'] += 1;
        }
        for(int i =0; i< arr.length; i++){
            if(chars[arr[i] - 'a'] == 1) return i;
        }
        return -1;
    }
}
