package p1;
import java.util.Scanner;

public class EvenOddUseTemp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();

        String evenOdd = (num % 2 == 0) ? "even" : "odd";

        System.out.println(num + " is " + evenOdd);

    }
}
