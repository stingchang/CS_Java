package question_001;

public class Q007_Reverse_Integer {
    public int reverse(int x) {
        // 1. hold sign value
        // 2. set x to positive
        // 3. reverse digits one by one, if over flow can happen then return 0

//         boolean isNegavite = x < 0;
//         x = Math.abs(x);
//         long y = 0;
//         long max  = isNegavite ? -1 * (long)Integer.MIN_VALUE : (long)Integer.MAX_VALUE;
//         while( x > 0 ){
//             y = y*10 + x%10;
//             if(y > max)
//                 return 0;
//             x *= 0.1;

//         }

//         y *= isNegavite ? -1 : 1;


        int y = 0;
        while(x!=0){
            int z = y * 10 + x % 10;
            // overflow
            if(z/10 != y) {
                // System.out.println("here z = "+z+", y = "+y+" ,x = "+x);
                return 0;

            }


            y = z;
            x /= 10;
        }


        return y;
    }
}
