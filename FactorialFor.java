package p1;
import java.util.Scanner;

public class FactorialFor {
	public static void main(String[] args) {
//			
//		int n=6,  fact=1;
			
//	    for(int i=1; i<=n; i++) {
//	    	fact=fact*i;
//		}
//		System.out.println("factorial of "+n+" = " +fact);//factorial of 6 = 720
		
//		int n=5, fact=1;
//		int i =1;
//		 while(i<=n) {
//			 fact=fact * i;
//			 i++;
//		 }
//		System.out.println("Factorial of "+n+" = " +fact);//Factorial of 5 = 120
		int n, i, fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		n = sc.nextInt();
		sc.close();
		
		for(i=1; i<=n; i++) {
			fact=fact*i;
		}
		System.out.println( "Factorial is = " +fact);
	}
}
