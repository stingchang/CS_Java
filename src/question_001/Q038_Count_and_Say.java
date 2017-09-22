package question_001;

public class Q038_Count_and_Say {
    public String countAndSay(int n) {
        if (n <= 0) return "";
        String base = "1";
        for (int i = 2; i <= n; i++) {
            System.out.print(i + " : ");
            base = convert(base);
        }
        return base;
    }

    public String convert(String str) {
        int count = 1;
        char c = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == c) count++;
            else {
                sb.append(count);
                sb.append(c);

                c = str.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);

        return sb.toString();
    }
}
