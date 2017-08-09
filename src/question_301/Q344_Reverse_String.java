package question_301;

public class Q344_Reverse_String {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        for(int i =0 ; i< len/2; i++){
            char c = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = c;
        }
        
        return String.valueOf(arr);
    }
}
