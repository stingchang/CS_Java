package question_251;

import java.util.Random;

public class Q278_First_Bad_Version {
    public int firstBadVersion(int n) {
        int i = 1, j = n;
        // converge(i, j) and remove non bad versions in each loop
        while(i<j){
            int m = i+(j-i)/2;
            if(isBadVersion(m)){
                j = m;
            } else {
                i = m+1;
            }
        }

        return i;
    }

    public boolean isBadVersion(int m){
        Random r = new Random(1);

        return r.nextBoolean();

    }
}
