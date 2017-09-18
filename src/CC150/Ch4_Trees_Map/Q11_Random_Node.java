package CC150.Ch4_Trees_Map;

import java.util.Random;

public class Q11_Random_Node {
    Q11_Random_Node left;
    Q11_Random_Node right;
    int value;
    int leftCount;
    int rightCount;
    public Q11_Random_Node(int value){
        this.value = value;
        left = right = null;
        leftCount = rightCount = 0;
    }
    public static Q11_Random_Node getRandom(Q11_Random_Node node){
        Random r = new Random();
        return getNode(r.nextInt(node.leftCount+node.rightCount+1)+1, node);
    }
    public static Q11_Random_Node getNode(int num, Q11_Random_Node node){
        if(num == node.leftCount+1) return node;
        if(num < node.leftCount+1) return getNode(num, node.left);
        return getNode(num-node.leftCount-1, node.right);
    }

    public static void main(String[] args){
        Random r = new Random();
        for(int i =0; i<10;i++)
        System.out.println(r.nextInt(3)+1);
    }
}
/*
will add 2 parameters (leftSize, rightSize) to each node to memorize size of left and right tree

generate a random number r from 1 to (leftSize+1+rightSize)
if(r == leftSize+1) return mid
if(r <= leftSize) go to left(r)
if(r >leftSize+1) go to right(r-leftCount-1)
*/
