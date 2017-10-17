package question_651;

public class Q686_Repeated_String_Match {
    public int repeatedStringMatch(String A, String B) {
        int count = 1;
        String newA = A;
        while (newA.length() < B.length()) {
            newA += A;
            count++;
        }
        if (newA.indexOf(B) >= 0) return count;
        if ((newA + A).indexOf(B) >= 0) return count + 1;
        return -1;
    }
}
