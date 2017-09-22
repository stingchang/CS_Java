package question_301;

public class Q345_Reverse_Vowels_of_a_String {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int first = 0, second = arr.length-1;
        while(first<second) {
            while( !isVlowel(arr[first]) && first<second ) first++;
            while( !isVlowel(arr[second]) && first<second ) second--;

            if(first<second){
                char c = arr[first];
                arr[first] = arr[second];
                arr[second] = c;
                first++;
                second--;
            }
        }

        return String.valueOf(arr);
    }
    public boolean isVlowel(char c){
        switch(c){
            case 'a':case 'e':case 'i':case 'o':case 'u':
            case 'A':case 'E':case 'I':case 'O':case 'U':
                return true;
            default:
                return false;

        }
    }
}
