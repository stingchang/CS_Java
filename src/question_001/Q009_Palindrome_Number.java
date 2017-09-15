package question_001;

public class Q009_Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0 || (x>0 && x%10 == 0)){
            return false;
        }

        if(x<10)
            return true;

        int r = 0;
        while(x>=r){

            // 1234 123, need to deal with 10 0
            if(x/10 == r || x == r){
                return true;
            }
            r = r*10 + x%10;
            x = x/10;
        }
        return false;
    }
}
