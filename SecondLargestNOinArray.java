package p1;

//public class SecondLargestNOinArray {
//	public static void main(String[]args) {
//    	int  temp   ;
//		int[] ar= {50,30,67,44,99};
//		
//		for( int i=0; i<ar.length; i++) {
//			for(int j=i+1; j<ar.length; j++) {
//				
//				if(ar[i]>ar[j]) {
//					
//					 temp=ar[i];
//					ar[i]=ar[j];
//					ar[j]=temp;
//				}
//			}
//			    System.out.print(ar[i]+ " ");//shot in Accending order= 30 44 50 67 99
//			
//	}
//		System.out.println();
//		System.out.println(ar[ar.length-2]);// find 2nd largest element=67
//	}
//}

//		 int  sum=0;
//		 for(int i = 0; i<ar.length; i++) {
//			 sum= sum+ar[i];
//		 }
//	     int avg=sum/ar.length;
//	     System.out.println(avg);//find avg of array=58
		
	    
public class SecondLargestNOinArray {
	
	public static void main(String[]args) {
	     int temp;
	     int[] ar= {50,30,67,44,99};
		for( int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				
				if(ar[i]<ar[j]) {
					
					 temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			    System.out.print(ar[i]+ " ");//shot in Decending  order= 99 67 50 44 30 
			
		}
		System.out.println(ar[ar.length-2]);// 2nd smallest no=44
   }
}
