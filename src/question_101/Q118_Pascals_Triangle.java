package question_101;

import java.util.ArrayList;
import java.util.List;

public class Q118_Pascals_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>();
        if(numRows == 0) return lists;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        lists.add(list);
        while(lists.size()<numRows){
            List<Integer> last = lists.get(lists.size()-1);
            list = new ArrayList<>();
            list.add(1);
            for(int i =0; i<last.size()-1; i++){
                list.add(last.get(i)+last.get(i+1));
            }
            list.add(1);
            lists.add(list);
        }

        return lists;
    }
}
