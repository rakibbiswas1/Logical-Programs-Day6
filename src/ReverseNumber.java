import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int remainder = 0;
        int reverse = 0;
        while (a != 0)  {
        remainder = a % 10;
        reverse = reverse * 10 + remainder;
        a = a /10;
            }
        System.out.println(reverse);
    }
}