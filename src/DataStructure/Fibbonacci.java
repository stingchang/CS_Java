package DataStructure;

public class Fibbonacci {
    public int recursion(int n){
        if(n <= 1) return 1;

        int res = recursion(n-1) + recursion(n-2);
        System.out.println(n+" : "+res);
        return res;
    }

    public int iteration(int n){
        int i0 = 1, i1 =1;
        int num = 2;
        while(num<n){
            i1 += i0;
            i0 = i1;
            num++;
            System.out.println(num+" : "+i1);
        }
        return i1;
    }

    public static void main(String[] args){
        Fibbonacci f = new Fibbonacci();
        f.iteration(5);
        System.out.println();
        f.recursion(5);
    }
}
