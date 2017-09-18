package CC150.Ch1_Arrays_Strings;

public class Q3_URLify {
    public static void urlify(char[] str, int length) {
        System.out.println(String.valueOf(str));
        int tail = str.length - 1, cur = length - 1;
        // no insertion needed
        while (cur < tail) {
            //System.out.println(cur+" : "+str[cur]);
            if (str[cur] == ' ') {
                cur--;
                str[tail--] = '0';
                str[tail--] = '2';
                str[tail--] = '%';

            } else {
                str[tail--] = str[cur--];
            }
        }
        System.out.println(String.valueOf(str));
    }

    public static void main(String[] args) {
        String str = "mr john smith    ";
        char[] arr = str.toCharArray();
        Q3_URLify q = new Q3_URLify();
        q.urlify(arr, 13);


    }
}
// replace all space with %20
// "Mr John Smith    ", 13
// "Mr%20John%20%Smith20"

// if this is a string, split it to substrings and use a stringbuilder to append substring+%20