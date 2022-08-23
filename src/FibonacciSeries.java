// 0 1 2 3 4 5 6 7 8 9 10 (using Position num start with o)

import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("enter temp :");
        temp=sc.nextInt();
        int a = 0;
        int b = 1;
        int c ;

        for (int i = 1; i <=temp ; i++) {
            System.out.println(" "+a);
            c = a +b;
            a = b;
            b = c;
        }
    }
}

/* public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a+ " "+b);
        int c ;
        for (int i = 1; i <=10 ; i++) {
            c = a +b;
            System.out.println(" "+a);
            a = b;
            b = c;
        }
    }
*/