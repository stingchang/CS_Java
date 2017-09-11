package OtherQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 打印一个数成它prime相乘的结果，例如12 = 2^2*3.
public class PrimeResult {
    public void getPrimeResult(int num) {
        List<Integer> list = primeList(num);

        StringBuilder sb = new StringBuilder();
        for(int p: list){
            int count = 0;
            while(num % p==0){
                count++;
                num = num/p;
            }
            sb.append(p);
            if(count>1) sb.append("^"+count);
            if(num>1) sb.append("*");

        }
        System.out.println(sb);
    }

    public List<Integer> primeList(int num) {
        List<Integer> list = new ArrayList<>();
        boolean[] notPrime = new boolean[num+1];
        int count = 0;
        for(int i =2; i<=num; i++){
            if(!notPrime[i] && num % i ==0) {
                list.add(i);
                count++;
            }
            for(int j = 2; i*j <=num; j++){
                notPrime[i*j] = true;
            }
        }
        // now we have all prime from 2 to num

        System.out.println(count+" : "+list+" : "+Arrays.toString(notPrime));
        return list;
    }

    public static void main(String[] args) {
        PrimeResult p = new PrimeResult();
        p.getPrimeResult(14*12);
    }
}
