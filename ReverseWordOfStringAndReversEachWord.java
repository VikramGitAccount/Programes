package p1;

public class ReverseWordOfStringAndReversEachWord {
	public static void main(String []args){
    	String s=" pradeep kumar chauhan";
    	
    	String [] s2 = s.split(" ");
    	
    	for(int i= s2.length-1; i>=0; i--) {
    		
    		System.out.print(s2[i]+" ");
    	}
    }
}
