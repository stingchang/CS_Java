package question_601;

public class Q606_Construct_String_from_Binary_Tree {
	 public String tree2str(TreeNode t) {
	        if(t == null) return "";
	        
	        return constructString(t);
	    }
	    
	    public String constructString(TreeNode t) {
	        StringBuilder sb = new StringBuilder();
	        sb.append(t.val);

	        if(t.left !=null && t.right !=null ){
	            sb.append("(" + constructString(t.left) + ")(" + constructString(t.right) + ")");
	        } else if(t.left != null){
	            sb.append("(" + constructString(t.left) + ")");
	        } else if(t.right != null){
	            sb.append("()(" + constructString(t.right) + ")");
	        } 
	        
	        return sb.toString();
	    }
}
