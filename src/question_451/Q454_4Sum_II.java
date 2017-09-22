package question_451;

import java.util.HashMap;
import java.util.Map;

public class Q454_4Sum_II {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int total = 0;

        // (k,v) v pairs from A, B that sums up to k
        Map<Integer, Integer> map = new HashMap<>();
        int len = A.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int key = A[i] + B[j];
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
        }

        // (k,v) v pairs from A, B that sums up to -k in map
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                int key = C[i] + D[j];
                total += map.getOrDefault(-key, 0);
            }
        }
        return total;
    }
}
