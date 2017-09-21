package question_551;

public class Q598_Range_Addition_II {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops == null || m == 0 || n==0) return 0;
        int rowMin = m, colMin = n;
        for(int[] pair: ops){
            rowMin = Math.min(pair[0], rowMin);
            colMin = Math.min(pair[1], colMin);
        }
        return colMin*rowMin;
    }
}
