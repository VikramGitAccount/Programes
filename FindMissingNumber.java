package p1;

public class FindMissingNumber {
        public static void main(String[] args) {
		
		int []x= {1,2,3,4,6,8,9};
		
		for(int i=0; i<x.length-1; i++) {
			if(x[i+1]!=x[i]+1) {
				
				System.out.println(x[i]+1+ "...is a missing number");
			}
		}
	}
}
