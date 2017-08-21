package question_101;

public class Q125_Valid_Palindrome {
    public boolean isPalindrome(String s) {
        char[] arr = s.toCharArray();

        int i =0, j = arr.length-1;
        while(i<j){
            while(!isalphanumeric(arr[i]) && i<j) i++;
            while(!isalphanumeric(arr[j]) && i<j) j--;
            if(i == j) return true;
            if(sameChar(arr[i], arr[j])){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    boolean isalphanumeric(char c){
        return ( ((c-'a')>=0 && ('z'-c)>=0) || ((c-'A')>=0 && ('Z'-c)>=0) || ((c-'0')>=0 && ('9'-c)>=0));
    }

    boolean sameChar(char a, char b){
        return Character.toLowerCase(a) == Character.toLowerCase(b);
    }
}
