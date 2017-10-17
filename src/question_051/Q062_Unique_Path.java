package question_051;

public class Q062_Unique_Path {
    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) return 0;
        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) arr[0][i] = 1;
        for (int i = 0; i < m; i++) arr[i][0] = 1;
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                arr[r][c] = arr[r - 1][c] + arr[r][c - 1];
            }
        }
        return arr[m - 1][n - 1];
    }

    public static void main(String[] args) {
        Q062_Unique_Path q = new Q062_Unique_Path();
        int ans = q.uniquePaths(36, 7);
    }
}
