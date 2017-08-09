package question_451;

public class Q461_Hamming_Distance {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
        
        int dist = 0;
        for(int i = 0; i< 32; i++) {
            dist += 1 & z;
            z >>= 1;
        }
        return dist;
    }
}
