package question_051;

public class Q091_Decode_Way {
    public int numDecodings(String s) {

        int a = 1, b = 1;
        if (s.length() == 0 || s.charAt(0) == '0') return 0;
        if (s.length() == 1) return 1;
        int sum = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        if(sum % 10 == 0 && sum > 20) return 0;
        b = s.charAt(1) == '0' ? 1 : ((s.charAt(0) - '0') * 10 + (s.charAt(1) - '0')) <= 26 ? 2 : 1;

        for (int i = 2; i < s.length(); i++) {
            char m = s.charAt(i - 1);
            char n = s.charAt(i);
            sum = (m - '0') * 10 + (n - '0');
            if (m == '0' && n == '0' || (sum % 10 == 0 && sum > 20)) return 0;
            else if (m == '0' || n == '0') b = a;
            else {

                if (sum <= 26) {
                    b = b + a;
                    a = b - a;
                } else {
                    a = b;
                }
            }
        }


        return b;
    }


    public static void main(String[] args) {
        Q091_Decode_Way q = new Q091_Decode_Way();

//        int ans = q.numDecodings("100");
        System.out.println(q.numDecodings("301"));
        System.out.println(q.numDecodings("1"));
        System.out.println(q.numDecodings("100"));
        System.out.println(q.numDecodings("10"));
        System.out.println(q.numDecodings("11"));
        System.out.println(q.numDecodings("101"));
        System.out.println(q.numDecodings("111"));
        System.out.println(q.numDecodings("1111"));
    }
}

/*
char c from s(0)~s(i)
a: ways at i-2
b: ways at i-1
00  ->  return 0
x0  ->  (a,b)->(a,a)
0x  ->  (a,b)->(a,a)
xx<=26-> (a,b)->(b, a+b)
xx>26-> (a,b)->(b, b)
*/
