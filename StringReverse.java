package p1;

import java.util.Scanner;

public class StringReverse{
    public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Write anything");
//		String str = scan.nextLine();
		
    	String str="vikram";
		 for(int i=str.length()-1; i>=0; i--) {
			 System.out.print(str.charAt(i));
		 }
	}
}