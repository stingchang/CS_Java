package question_201;

import java.util.HashSet;

public class Q202_Happy_Number {
    public boolean isHappy(int n) {
        HashSet<Integer> s = new HashSet<>();
      return check(n, s);
    }
    public boolean check(int n, HashSet<Integer> s ){
        
        
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum+=r*r;
            n/=10;
        }
        if(sum == 1) return true;
        if(s.contains(sum)) return false;
        
        s.add(sum);
        return check(sum, s);
    }
}
