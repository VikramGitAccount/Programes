package p1;
public class SecondSmallestNumberInAnArray {
	   public static void main(String args[]){
	      int temp; 
	      int ar[] = {10, 20, 25, 63, 96, 57};

	      for(int i = 0; i<ar.length; i++ ){
	         for(int j = i+1; j<ar.length; j++){
	        	 
	            if(ar[i] > ar[j]){
	            	
	               temp = ar[i];
	               ar[i] = ar[j];
	               ar[j] = temp;
	            }
	         }
	         System.out.print(ar[i]+ " ");
	      }
	      System.out.println();
	      System.out.println(ar[1]);
	   }
}