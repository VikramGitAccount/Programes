package p1;
import java.util.Scanner;
public class CharacterOccuransInString {
	public static void main(String[]args) {
        String s1="my name is vikram and name is no and none";
	    String s2= "m";
		
	/*1	 Scanner scan=new Scanner(System.in);
		System.out.println("Write something");
		String s1 = scan.nextLine();
		
		System.out.println("Which character's occurance you want to know");
		String s2=scan.nextLine();  
		                           */
		int count=0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==s2.charAt(0)) {
				count++;
			}
		}
		System.out.println(s2.charAt(0)+ " is repeted " +count+ " times in avove String");
//2		String s="Welcome to you in my world ";
//		int count=0;
//		for(int i=0; i<=s.length()-1; i++) {
//			
//			if(s.charAt(i)=='m') {
//				count++;
//			}
//		}
//		System.out.println("frequency of character is: " +count );
	}
}

