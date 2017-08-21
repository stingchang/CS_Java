package question_201;

import java.util.Arrays;

public class Q204_Count_Prime {
    public int countPrimes(int n) {

        boolean[] primes = new  boolean[n+1];
        Arrays.fill(primes, true);
        for(int i = 2; i< n; i++){
            if(primes[i]) {
                for(int k = 2; i*k < n; k++){
                    primes[i*k] = false;
                }
            }
        }
        int count = 0;
        for(int i = 2; i<n; i++){
            count += primes[i] ? 1 : 0;
        }
        return count;

    }
}
