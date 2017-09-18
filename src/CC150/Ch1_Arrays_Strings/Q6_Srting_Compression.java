package CC150.Ch1_Arrays_Strings;

public class Q6_Srting_Compression {
    public String compression(String input) {
        char c = input.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < input.length(); i++) {
            char cur = input.charAt(i);
            if (c == cur) {
                count++;
            } else {
                sb.append(c);
                sb.append(count);
                c = cur;
                count = 1;
            }
        }
        sb.append(c);
        sb.append(count);

        return sb.length() <= input.length() ? sb.toString() : input;
    }
}

// aaabbcccd
// return a3b2c3d

// aababaab
// a2b1a1b1a2b1 longer than original, return aababaab

