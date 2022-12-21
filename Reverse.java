package p1;
//import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
		int n=23456, rem, rev=0;
//		int n, rem,rev=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter any NO: ");
//		 n = scan.nextInt();
//		 scan.close();
		while(n>0) {
			rem=n%10;
			rev= rev * 10 +rem;
			n=n/10;
		}
		System.out.println(rev);
	}
}
