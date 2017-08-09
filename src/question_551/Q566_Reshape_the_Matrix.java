package question_551;

public class Q566_Reshape_the_Matrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
        int r1 = nums.length;
        if(r1 == 0)
            return nums;
            
        int c1 = nums[0].length;
        if(c1 == 0)
            return nums;
            
        if(r1*c1 != r*c)
            return nums;
        
        int[][] newArr = new int[r][c];
        for(int i=0; i< r; i++){
            for(int j=0; j< c; j++){
                int index = (i)*c + j;
                System.out.println("["+(index/c1)+","+(index%c1)+"] => ["+i+","+j+"]");
                newArr[i][j] = nums[index/c1][index%c1];
            }
            
        }
        return newArr;
    }
//	public static void main(String[] args){
//		Q566_Reshape_the_Matrix q = new Q566_Reshape_the_Matrix();
////		int[][] arr = {{1,2,3,4}};
////		int r=2, c=2;
////		int[][] a = q.matrixReshape(arr, r, c);
//		
//	}
}
