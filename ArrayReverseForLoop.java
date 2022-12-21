package p1;

public class ArrayReverseForLoop {

	public static void main(String[]args) {
		char[] x= {'A','B','C','D','E'};
//	    String[]x= {"ram","kam","sam","piyush"};
//		int[]x= {10,20,30,40,50,60};
		
		for(int i=x.length-1; i>=0; i--) {
			System.out.print(x[i] +" ");
		}
	}
}
