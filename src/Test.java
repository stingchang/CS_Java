import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
        toBaseNice();
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
