package HackerRank_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TheLongest_Increasing_Subsequence {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//        List<Integer> input = new ArrayList<>(;)

        Scanner scan  = new Scanner(System.in);

        int size = Integer.parseInt(scan.nextLine());
        int[] input = new int[size];
        for(int i = 0; i< size; i++) {
            input[i] = Integer.parseInt(scan.nextLine());
        }


//        List<Integer> list = new ArrayList<>();
//        while(scan.hasNextLine()){
//            list.add(Integer.parseInt(scan.nextLine()));
//        }
//        for(int i : input){
//            System.out.println(i);
//        }
        scan.close();
        size = findLIS(input);
        System.out.println(size);
    }

    static int findLIS(int[] input){
        List<Integer> list = new ArrayList<>();


        for(int i = 0; i< input.length; i++){
            int e = input[i];
//            int listSize = list.size();

            if(list.size() == 0 || list.get(list.size()-1) < e){
                list.add(e);
            }
            else if(e < list.get(0)){
                list.set(0, e);
            }
            else {
              //  System.out.print("add " +e+" into list => ");
                // do binary search and add element into list
                addToList(list, e);
            }
         //   System.out.println("list = "+Arrays.toString(list.toArray()));
        }

        return list.size();
    }

    static void addToList(List<Integer> list, int e){

        // do a binary search and add new element into list to keep list in ascending order
        int i = 0, j = list.size()-1;
//        System.out.print("e = "+e+"("+list.get(i)+","+list.get(j)+")");
        // i e j
        while(i + 1 < j){
//            int pre = list.get(i);
//            int post = list.get(j);
            int mid = i+(j-i)/2;
            int midElement = list.get(mid);
        //    System.out.print("mid = "+midElement+" ");
            if(e < midElement) {
                j = mid;
            } else if(e > midElement) {
                i = mid;
            } else {
                return;
            }


        }
//System.out.print("e = "+e+"("+list.get(i)+","+list.get(j)+")");
        i = list.get(i)>e?i:i+1;
        list.set(i, e);
    }
}
/*
* create a list
* for each element e from input array
*   if list is empty
*       add e into list
*   else if e > last element in list
*       add e into list
*   else find smallest element i in list that > e
*       replace i with e
* */