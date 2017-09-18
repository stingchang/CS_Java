package CC150.Ch1_Arrays_Strings;

public class Q5_One_Way {
    public boolean oneStep(String s1, String s2) {
        if (s1.length() == s2.length()) return same(s1, s2);

        String longStr = s1.length() > s2.length() ? s1 : s2;
        String shortStr = s1.length() < s2.length() ? s1 : s2;
        if (longStr.length() - shortStr.length() > 1)
            return false;

        int index = 0;
        while (longStr.charAt(index) == shortStr.charAt(index)) {
            index++;
        }
        return same(longStr.substring(index + 1), shortStr.substring(index));

    }

    public boolean same(String s1, String s2) {
//        return s1.
        return s1.compareTo(s2) == 0;
    }
}
// check if string s1 can be modified to st using only one step
// abc => adc
// abc => adcd
// abc => ad