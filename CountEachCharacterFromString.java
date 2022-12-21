package p1;
import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterFromString {
	public static void main(String[] args) {
	    
	     String str=("hollywoodhhello");
	     
		Map<Character, Integer> s= new HashMap<>();
		
		char[]ch=str.toCharArray();
		
		for(char c: ch) {
			if(s.containsKey(c)) {
				
				s.put(c, s.get(c)+1);
			}else {
				s.put(c, 1);
			}
		}
		System.out.println(s);
	}
}
