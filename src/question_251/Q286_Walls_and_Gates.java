package question_251;

public class Q286_Walls_and_Gates {


}
// -1 wall
// 0 gate
// inf empty

// iterate through the matrix and get all empty location
// for each empty room e(i,j) do dfs
//  [i+1, j] [i-1, j] [i, j+1] [i, j-1],
//      dis+=1, if(i+1, i-1, j+1, j-1) out of boundary or is wall or r[i,j] < dis, return
//      if(r[i,j] > dis ) r[i, j] =dis

// http://www.cnblogs.com/grandyang/p/5285868.html