package p1;

public class MinValueInArray {

	public static void main(String[] args) {  
		  
        int [] arr =  {25, 33, 7,9,40};  
        
        int min = arr[0];  
          
        for (int i = 0; i < arr.length; i++) {  
             
           if(arr[i] <min)  
               min = arr[i];  
        }  
        System.out.println(min);  
    }  
}
