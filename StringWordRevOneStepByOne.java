package p1;

public class StringWordRevOneStepByOne {
    public static void main(String []args){
    	String s=" my name is ayush singh rajput";
    	String s1= "";
    	String [] s2 = s.split("\\s");
    	
    	for(int i= s2.length-1; i>=0; i--) {
    		s1= s1+s2[i]+" ";
    		System.out.println(s1);
    	}
    }
}
	


