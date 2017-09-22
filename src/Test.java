import java.util.*;

public class Test {
    public static void main(String[] args){
//        int[] arr = new int[]{1,2,3};
//        int[] arr2 = Arrays.copyOfRange(arr, 0,2);
//        System.out.println(Arrays.toString(arr2));
//
//        int[] arr3 = Arrays.copyOf(arr2, arr2.length);
//        arr3[1] = 0;
//        System.out.println(Arrays.toString(arr3));
//        System.out.println(Arrays.toString(arr2));
//
//        System.out.println("null == null : "+());
//        System.out.println("!null : "+(null));
//        char[] charArr = {'a','x','e','b','d'};
//        Arrays.sort(charArr);
//        System.out.println(String.valueOf(charArr));
//
//        List<String> list = new ArrayList<>();
//
//        boolean[] bArr = new boolean[10];
//        System.out.println(Arrays.toString(bArr)+"\n");
        String s1 = "b";
        String s2 = "aaa";
        System.out.println(s1 == s2);
        char c = 'b';
        System.out.println(Character.toUpperCase(c));
        System.out.println(2^(1<<c-'a'));
//        toBaseNice();

        StringBuilder sb = new StringBuilder();
        sb.append("111");

        Map<Integer, Integer> map = new HashMap<>();
//        map.re
        int x = 255;
        System.out.println(Integer.toBinaryString(x));
//        x>>=1;
        System.out.println(Integer.toBinaryString(x<<8));

        System.out.println("Hex decimal test");
        String oct = "10";
        System.out.println(oct+" : "+Integer.parseInt(oct,16));
        oct = "16";
        System.out.println(oct+" : "+Integer.parseInt(oct,16));
        oct = "0";
        System.out.println(oct+" : "+Integer.parseInt(oct,16));
        oct = "-1";
        System.out.println(oct+" : "+Integer.parseInt(oct,16));
        oct = "-2";
        System.out.println(oct+" : "+Integer.parseInt(oct,16));

        System.out.println((1+1001)>>>1);

        String a = "ababababab";
        System.out.println(Arrays.toString(a.split("a")));
    }

    public static void toBaseNice(){
//        Random r = new Random(5);
        for(int i =0; i< 15; i++){
            int a = (int )(Math.random() * 1000 + 1);
            System.out.print(a +" : ");
            Integer.toString(a, 9);
            System.out.println(Integer.toString(a, 9));
        }
    }

    public static int[] array(){
        return new int[]{1,2};
    }
}
