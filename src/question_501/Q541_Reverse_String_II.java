package question_501;

public class Q541_Reverse_String_II {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        
        int len = arr.length;
        for(int i =0; i<len; i+=2*k) {
            revert(arr, i, i+k <= len?i+k-1:len-1);
        }
        
        return String.valueOf(arr);
    }
    
    private void revert(char[] arr, int str, int end){
        while(str<end){
            char t = arr[str];
            arr[str] = arr[end];
            arr[end] = t;
            str++;
            end--;
        }
    }
}
