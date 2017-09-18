package CC150.Ch1_Arrays_Strings;

import java.util.Arrays;

public class Q2_Check_Permutation {
    public boolean isPermutation(String str1, String str2) {
        char[] arrA = str1.toCharArray();
        char[] arrB = str2.toCharArray();
        Arrays.sort(arrA);
        Arrays.sort(arrB);
        return arrA == arrB;
    }
}
