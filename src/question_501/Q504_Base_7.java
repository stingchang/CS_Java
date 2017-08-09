package question_501;

public class Q504_Base_7 {
    public String convertToBase7(int num) {
        if(num == 0) return "0";
        
        boolean isNagative = num<0;
        num = Math.abs(num);
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num%7);
            num = num/7;
        }
        sb = sb.reverse();
        return isNagative ? '-' + sb.toString():sb.toString();
    }
}
