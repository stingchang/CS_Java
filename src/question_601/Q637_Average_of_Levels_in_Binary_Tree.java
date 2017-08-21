package question_601;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q637_Average_of_Levels_in_Binary_Tree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avg = new ArrayList<>();
        Set<TreeNode> level = new HashSet<>();
        level.add(root);
        while(!level.isEmpty()){
            Set<TreeNode> nextLevel = new HashSet<>();
            double count = 0;
            for(TreeNode n: level){
                count += n.val;
                if(n.left!=null){
                    nextLevel.add(n.left);
                }
                if(n.right!=null){
                    nextLevel.add(n.right);
                }
            }
            avg.add(count/level.size());
            level.clear();
            level.addAll(nextLevel);
        }

        return avg;
    }
}
