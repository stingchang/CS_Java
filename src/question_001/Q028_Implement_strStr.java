package question_001;

public class Q028_Implement_strStr {
    public int strStr(String haystack, String needle) {
        int nLen = needle.length(), hLen = haystack.length();
        if(nLen == 0) return 0;
        for(int i =0; i<= hLen-nLen; i++)
            if( haystack.substring(i, i+nLen).equals(needle) ) return i;

        return -1;
    }
}
