package CC150.Ch4_Trees_Map;

public class Q10_Check_Subtree {
    public boolean isSubTree(Node t1, Node t2) {
        if (t1 == null && t2 != null) return false;
        if (t2 == null) return true;

        if (t1 != t2) return isSubTree(t1.left, t2) || isSubTree(t1.right, t2);

        return isSame(t1, t2);

    }
    public boolean isSame(Node t1, Node t2){
        if(t1!=t2) return false;
        return isSame(t1.left, t2.left) && isSame(t1.right, t2.right);
    }
}
