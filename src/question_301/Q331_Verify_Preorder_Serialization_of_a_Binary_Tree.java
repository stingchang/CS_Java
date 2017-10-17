package question_301;

public class Q331_Verify_Preorder_Serialization_of_a_Binary_Tree {
    public boolean isValidSerialization(String preorder) {

        String[] tokens = preorder.split(",");
        int count = 1;
        for(String s: tokens){
            count--;
            if(count<0) return false;
            if(!s.equals("#")) count+=2;
        }
        return count==0;

    }
}
