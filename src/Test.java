import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3};
        int[] arr2 = Arrays.copyOfRange(arr, 0,2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr2, arr2.length);
        arr3[1] = 0;
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr2));

    }
}
