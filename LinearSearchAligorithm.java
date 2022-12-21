package p1;

public class LinearSearchAligorithm {
	public static void main(String[] args) {
		
//		 String [] arr= {"pradeep","rahul","rohit","vikram","piyush",};
		int []x= {10,3,5,8,0,3,8,7,8,8,12,19};
		 
		        int temp=0;
//				 for(int i=0; i<arr.length; i++) {
//					 
//					 if(arr[i]=="vikram") {
		        for(int i=0; i<x.length; i++) {
		        	if(x[i]== 8) {
		        		
						 System.out.println("iteam is found in array at index: " +i);
						 
						 temp++;
					 }
				 }
				 if(temp==0) {
					 System.out.println("iteam is not found");
				 }
		 }
}
