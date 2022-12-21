package p1;
//import java.util.Scanner;

public class SumOfFirstNNaturalNumber {
	public static void main(String[] args) {
		int n=10,sum=0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter any natural no:");
//		n=scan.nextInt();
//		scan.close();
		for(int i=0; i<=n; i++) {
			sum=sum+i;
		}
		System.out.println("sum of natural NO are:" +sum);		
	}
}
