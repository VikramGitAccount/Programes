package p1;
import java.util.Scanner;

public class FibnacciSeries {
        public static void main(String[] args) {
			int n=8,n1=0, n2=1;
			for(int i=1; i<=n; ++i) {
				System.out.print(n1+" ");
				
				int sumOfPrevTwo=n1+n2;
				n1=n2;
				n2=sumOfPrevTwo;
			}
//   	    int i=1;
//			while(i<=n) {
//				System.out.println(n1+" ");
//				int sumOfPrevTwo=n1+n2;
//				n1=n2;
//				n2=sumOfPrevTwo;
//				i++;
//			}
//			int n,n1=0, n2=1;
//			Scanner scan=new Scanner(System.in);
//			System.out.println("Enter any NO: ");
//			n=scan.nextInt();
//			
//			scan.close();
//			for(int i=1; i<=n; ++i) {
//				System.out.println(n1+" ");
//				
//				int sumOfPrevTwo=n1+n2;
//				n1=n2;
//				n2=sumOfPrevTwo;
//			}
		}
}



