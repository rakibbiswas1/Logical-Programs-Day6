import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        int test = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                test = test + i;
            }
        }
        if (test == a) {
            System.out.println(a + " is a perfect number");
        } else {
            System.out.println(a + " is not perfect number ");
        }
    }
}
