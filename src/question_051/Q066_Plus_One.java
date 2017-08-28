package question_051;

public class Q066_Plus_One {
    public int[] plusOne(int[] digits) {
        int carry = 1, sum = 0, len = digits.length;

        for(int i =len-1; i>=0; i--){
            sum = digits[i] + carry;
            digits[i] =  sum % 10;
            carry = sum/10;
        }
        if(carry == 0){
            //System.out.println("1 digits: "+Arrays.toString(digits));
            return digits;

        }

        //System.out.println("1 digits: "+Arrays.toString(digits));
        int[] newArr = new int[len+1];
        newArr[0] = 1;
        System.arraycopy(digits, 0, newArr, 1, len);
        return newArr;
    }
}
