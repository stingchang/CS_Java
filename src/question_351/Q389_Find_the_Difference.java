package question_351;

public class Q389_Find_the_Difference {
    public char findTheDifference(String s, String t) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int pos1 = 0, pos2 = 0;
        for(int i = 0; i < s.length(); i++){
            pos1 = s.charAt(i) - 'a';
            arr1[pos1]++;
            
            pos2 = t.charAt(i) - 'a';
            arr2[pos2]++;
        }
        pos2 = t.charAt(t.length()-1)- 'a';
        arr2[pos2]++;
        
        char c = 'a';
        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));
        for(int i = 0; i < 26; i++){
            if(arr1[i] < arr2[i]) {
                c=(char)((int)'a' + i);
                // System.out.println((int)'a' + " "+i);
            }
            
        }
        
        return c;
    }
}

//int total = 0;
//for(int i = 0; i< s.length(); i++){
//    total = total - s.charAt(i) + t.charAt(i);
//}
//total += t.charAt(t.length()-1);
//return (char)total;

//https://leetcode.com/problems/find-the-difference/#/solutions
