import java.util.Random;
import java.util.Scanner;
public class CouponNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of coupon number: ");
        int a = sc.nextInt();
        String srt = ""; // string value is empty
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        for (int i = 0; i <= a ; i++) {
            char c = alphabet.charAt((r.nextInt(alphabet.length()))); // alphabet length means a to 10 total how many num
            srt = srt+String.valueOf(c);
        }

        System.out.println("Generated coupon number is: "+srt);
    }
}
