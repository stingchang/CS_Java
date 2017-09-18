package CC150.Ch1_Arrays_Strings;

public class Q9_String_Rotation {
    public boolean checkRotation(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        return s1.length() == s2.length() && (s1 + s1).indexOf(s2) >= 0;
    }
}
