package p1;

public class RemoveVowlFromString {
	public static void main(String []args){
    	String str= "vikram";
    	for(int i=0; i<str.length(); i++) {
    		char ch=str.charAt(i);
    		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
    			continue;
    		}else {
    			System.out.print(ch);
    		}
    	}
    }
}
