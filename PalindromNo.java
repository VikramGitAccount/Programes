package p1;
import java.util.Scanner;

public class PalindromNo {
	public static void main(String[] args) {
		int n=121, rem, rev=0,temp=0;
//		int n, rem, rev=0,temp=0;
//		Scanner scan=new Scanner(System.in);
//		System.out.println("enter any no: ");
//		n = scan.nextInt();
//		scan.close();
		temp=n;
		while(n>0) {
			rem=n%10;
			rev=rev * 10 +rem;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println(" palindrom nomber");
		}else {
			System.out.println("Not palindrom");
		}
	}
}
