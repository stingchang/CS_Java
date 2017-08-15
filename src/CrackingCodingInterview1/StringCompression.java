package CrackingCodingInterview1;

public class StringCompression {
    public String compress(String input){
        if(input.length() <=2 )
            return input;

        char[] arr = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        // use 2 indices i, j and a counter times to track how many times same character appear
        // when j reaches end or arr[i]!=arr[i], append current character and it's frequency to string builder

        int i = 0, j = 0, times = 1;
        while(j < arr.length-1){
            // 1

            j = i;
            times = 1;

            // j iterate to last repeated character or end
            while(j<arr.length-1 && arr[j+1] == arr[i]){
                times++;
                j++;
            }
            sb.append(arr[i]);
            sb.append(times);
            i = j+1;

        }

        return sb.length() > input.length() ? input : sb.toString();

    }
    public static void main(String[] args){
        StringCompression com = new StringCompression();

        String input = "ababbbbb";
        String newString = com.compress(input);
        System.out.println(newString);
    }
}


