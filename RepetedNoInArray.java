package p1;

public class RepetedNoInArray {
	public static void main(String[] args) {
		
	int[] x= {10,20,10,49,38,20,10,38,29,90,39,48,20};
//	String s="my name is name in which name is present";
	
         int count = 0;  
//        for (int i=0; i<=s.length()-1; i++) {  
//            if( s.charAt(i) == 'n') {  
        for(int i =0; i<=x.length-1; i++) {
        	if(x[i]==10) {

        		count++;  
            }  
        }  
        System.out.println("Frequency of number is: "+count);  
	}
}

