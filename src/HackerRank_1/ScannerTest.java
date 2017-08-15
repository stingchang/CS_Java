package HackerRank_1;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(sc.nextInt());
        System.out.println(sc.nextDouble());
        System.out.println(sc.nextInt());

        String name = sc.next();
        System.out.println(name);

        System.out.println("type ur age");
        int age = sc.nextInt();
        System.out.println(name);

        while(sc.hasNextLine()){
            System.out.println("hasNext : "+sc.nextLine());
        }

        sc.close();
    }
}
