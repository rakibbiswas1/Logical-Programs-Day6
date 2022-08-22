import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int temp =0;
        for (int i = 2; i <= a - 1; i++) {
            if (a%i ==0){
                temp=temp +1;
            }
        }
        if (temp>0){
            System.out.println(a+ " is not a prime number");
        } else {
            System.out.println(a+ " is a prime number");
        }
    }
}
