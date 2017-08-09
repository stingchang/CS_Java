package question_551;

public class Q557_Reverse_Words_in_a_String_III {
	public String reverseWords(String s) {
        if(s.length()<=1) return s;
        
        char[] arr = s.toCharArray();
        int str =0, end =0;
        while(end<arr.length){
            while(end<arr.length && arr[end] != ' '){
                end ++;
            }
            // System.out.println("swap "+arr[str]+" to "+arr[end-1]);
            swap(arr, str, end-1);
            str = end+1;
            end = end+1;
        }
        
        return String.valueOf(arr);
    }
    
    private void swap(char[] arr, int str, int end){
        while(end>str){
            char t = arr[str];
            arr[str] = arr[end];
            arr[end] = t;
            end--;
            str++;
        }
        // System.out.println(str+" "+end+  "  "+Arrays.toString(arr));
    }
}
