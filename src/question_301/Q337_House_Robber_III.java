package question_301;

public class Q337_House_Robber_III {
    public int rob(TreeNode root) {
        return helper(root)[0];
    }

    public int[] helper(TreeNode n){
        int[] profit = new int[]{0,0}; // max profit including current and max not includes current
        if(n == null) return profit;

        int[] l = helper(n.left);
        int[] r = helper(n.right);

        profit[1] = l[0]+r[0];
        profit[0] = Math.max(l[1]+r[1]+n.val, profit[1]);
        return profit;
    }
}
