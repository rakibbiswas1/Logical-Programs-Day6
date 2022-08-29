import java.util.Scanner;
public class StopWatchSimulator {
    public static void main(String[] args) {
        char input = ' ';
        long start = 0;
        long end = 0;
        double timeElapsed = 0;

        System.out.print("Enter any character to START the stopwatch : ");
        Scanner sc=new Scanner(System.in);
        input = sc.next().charAt(0);
        start = System.currentTimeMillis();
        System.out.print("Enter any character to STOP the stopwatch : ");
        input = sc.next().charAt(0);
        end = System.currentTimeMillis();
        timeElapsed = (end-start)/1000;
        System.out.println("Time Elapsed : "+timeElapsed+"sec");
        sc.close();
    }

}
