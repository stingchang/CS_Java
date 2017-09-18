package CC150.Ch4_Trees_Map;

public class Q8_First_Common_Ancestor {
    public Node findAncestor(Node a, Node b, Node root){
        if(root == a || root == b) return root;
        boolean aLeft = isAncestor(root.left, a);
        boolean bLeft = isAncestor(root.left, b);

        if(aLeft && !bLeft || bLeft && !aLeft) return root;

        if(aLeft && bLeft) return findAncestor(a,b,root.left);
        return findAncestor(a,b,root.right);

    }

    public boolean isAncestor(Node cur, Node a){
        if(cur == a) return true;
        if(cur == null) return false;
        return isAncestor(cur.left, a) && isAncestor(cur.right, a);
    }
}
