package CrackingCodingInterview1;

import java.util.Arrays;

public class URLify {
    public String urlify(char[] arr){
        System.out.println(arr);
        // 1. Find each sub string and move it to array end
        // 2. Insert "%20" before it
        // 3. Repeat 1~2

        // use two indices to track each string
        int last = arr.length -1;
        int first = last;


        // 1. reverse string
        // 2. 2 indices i,j; i at location 0 and j at start of first string
        // 3. if arr[j] is character -> copy it to location i
        //      else filled %20 at i~i+2, move i to i+3, move j to next string
        // repeat till j reaches end

        int pre = arr.length-1, post = pre;
        while(pre>0 && post>pre){
            // find end of string
            while(pre>0 && arr[pre]==' '){
                pre --;
            }
            // copy string
            while(pre>0&&arr[pre]!=' '){
                arr[post] = arr[pre];
                System.out.print(arr[pre]);
                post--;
                pre--;
            }
            System.out.println();
            // insert "%20"
            if(post > 2){
                arr[post] = '0';
                arr[post-1] = '2';
                arr[post-2] = '%';
                post-=3;
            }
            System.out.println("pre = "+pre+", post = "+post);
        }
        System.out.println(Arrays.toString(arr));
        return String.valueOf(arr);
    }
   public static void main(String[] args) {
        String st = "I am Sting    ";
        URLify urLify = new URLify();
        String newSt = urLify.url(st);
        System.out.println(newSt);
   }
   public static String url(String str){
       char[] arr = str.toCharArray();
       int pre = arr.length-1, post = pre;
       // search from end or array, find first string
       while(arr[pre] ==' ')
           pre--;

       while(post>pre){
           if(arr[pre]==' '){
               arr[post] = '0';
               arr[post-1] = '2';
               arr[post-2] = '%';
               post-=3;
               while(arr[pre] == ' ')
                   pre--;
           }
           else {
               arr[post] = arr[pre];
               pre--;
               post--;
           }
       }
       return String.valueOf(arr);
   }
 
}
/*
"I_am_Sting____"
"____gnitS_ma_I"
while(start != )
*/