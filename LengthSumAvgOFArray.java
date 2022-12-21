package p1;

public class LengthSumAvgOFArray {
	public static void main(String[] args) {
		   
		int sum=0;
		int []ar= {90,80,70,60,50};
		
		System.out.println("length of the array: " +ar.length);
		
		for(int i=0; i<ar.length; i++) {
			
//			System.out.println("given array at index " +i+ " is: "+ar[i]);
			
			sum=sum+ar[i];
		}
		System.out.println("sum of the array is: " +sum);
		int avg=sum/ar.length;
		System.out.println("average of the array is: " +avg);
	}
}
