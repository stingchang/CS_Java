package question_501;

public class Q507_Perfect_Number {
    public boolean checkPerfectNumber(int num) {
        int sum = 1; // 1 is also divider
        for(int i =2;  i<= Math.sqrt(num); i++) {
            if(num%i == 0) {
                sum += i+(num/i==i?0:num/i);
            }
        }
        return sum==num && num>1;
    }
}
