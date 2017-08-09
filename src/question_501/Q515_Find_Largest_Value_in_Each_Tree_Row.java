package question_501;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q515_Find_Largest_Value_in_Each_Tree_Row {
	public List<Integer> largestValues(TreeNode root) {
        if(root == null)
            return Arrays.asList(new Integer[]{});
        
        List<Integer> maxVals = new ArrayList<>();
        List<TreeNode> curRow = new ArrayList<>();
        
        curRow.add(root);
        while(!curRow.isEmpty()){
            int max = curRow.get(0).val;
            List<TreeNode> nextRow = new ArrayList<>();
            
            for(TreeNode n: curRow){
                if(n.left != null) nextRow.add(n.left);
                if(n.right != null) nextRow.add(n.right);
                
                max = Math.max(max, n.val);
            }
            maxVals.add(max);
            curRow.clear();
            curRow.addAll(nextRow);
        }
        
        return maxVals;
    }
}
