package question_101;

public class Q190_Reverse_Bits {
    public int reverseBits(int n) {
        int c = 0;
        for(int i =0; i<32; i++) {
            c = (c<<1) +(n&1);
            n>>=1;
        }
        return c;
    }
}
