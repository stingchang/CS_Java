package CC150.Ch1_Arrays_Strings;

public class Q1_Is_Unique {
    public boolean isUnique(String str) {
        int mask = 0;
        for(int i =0; i<str.length(); i++){
            mask^=str.charAt(i);
        }
        return mask==0;
    }
}
// no additional data structure allowed