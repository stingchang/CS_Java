package question_251;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q293_Flip_Game {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> result = new ArrayList<>();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                String newS =
                        String.valueOf(Arrays.copyOfRange(arr, 0, i))+
                                (arr[i]=='-' ? "++" : "--")+
                                String.valueOf(Arrays.copyOfRange(arr, i+2, arr.length));
                result.add(newS);
            }
        }

        return result;
    }
}
