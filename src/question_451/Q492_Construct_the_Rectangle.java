package question_451;

public class Q492_Construct_the_Rectangle {
    public int[] constructRectangle(int area) {
        // find largest divisor <= sqrt(area)
        int sqrt  = (int)Math.floor((int)(Math.sqrt(area)));
        while(area%sqrt > 0 && sqrt>1){
            sqrt--;
        }
        
        return new int[]{area/sqrt, sqrt};
    }
}
