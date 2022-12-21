package p1;

public class ArmstrongNumber {

	public static void  main (String[]args) {
		 int n=153, rem, sum=0;
		 while(n>0) {
			 rem=n%10;
			 sum=sum + (rem*rem*rem);
			 n=n/10;
		 }
	    System.out.println(sum);
		 
//			int n=54748, rem, sum=0;
//			int temp;
//			temp=n;
//			while(n>0) {
//				    rem=n%10;
//				   sum= sum+(rem*rem*rem*rem*rem);
//				   n=n/10;
//			}
//			if(temp==sum) {
//				System.out.println("ar");
//			}else {
//				System.out.println("not");
//			}
	}
}
