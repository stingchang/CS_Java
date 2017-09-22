package question_601;

public class Q657_Judge_Route_Circle {
    public boolean judgeCircle(String moves) {
        int r = 0, u = 0;
        for(char c: moves.toCharArray()){
            switch(c){
                case 'D':u--;
                    break;
                case 'U':u++;
                    break;
                case 'R':r++;
                    break;
                case 'L':r--;
                    break;
            }
        }
        return r ==0 && u ==0;
    }
}
