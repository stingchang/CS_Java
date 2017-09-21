package question_251;

public class Q258_Add_Digits {
    public int addDigits(int num) {
        return num==0 ? 0 : num % 9 == 0 ? 9 :num % 9;
    }
}
