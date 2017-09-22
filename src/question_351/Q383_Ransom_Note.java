package question_351;

public class Q383_Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote == null || magazine == null) return false;
        int eLen = ransomNote.length();
        int mLen = magazine.length();
        if(eLen>mLen) return false;

        int[] arr = new int[256];
        for(int i =0; i< mLen; i++) {
            arr[(int)(magazine.charAt(i))]++;
        }
        // System.out.println(Arrays.toString(arr));
        for(int i =0; i< eLen; i++) {
            int index = (int)ransomNote.charAt(i);
            arr[index]--;
            if(arr[index]<0) return false;
        }
        //System.out.println(Arrays.toString(arr));
        return true;
    }
}
