package p1;
import java.util.Scanner;
public class CheckLeapYear {
	  public static void main(String[] args) {

//	    // year to be checked
//	    int year = 1900;
//	    boolean leap = false;
//
//	    // if the year is divided by 4
//	    if (year % 4 == 0) {
//
//	      // if the year is century
//	      if (year % 100 == 0) {
//
//	        // if year is divided by 400
//	        // then it is a leap year
//	        if (year % 400 == 0)
//	          leap = true;
//	        else
//	          leap = false;
//	      }
//	      // if the year is not century
//	      else
//	        leap = true;
//	    }
//	    else
//	      leap = false;
//
//	    if (leap)
//	      System.out.println(year + " is a leap year.");
//	    else
//	      System.out.println(year + " is not a leap year.");
//	  }}
		    int y;
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter any Year: ");
			y = scan.nextInt();
			
			scan.close();
			boolean isLeap= false;
			
			if(y%4==0) {
			     if(y%100==0) {
			         if(y%400==0) {
			                isLeap = true;
			         }else
			            	  isLeap = false;
			         } 	  
			         else
			        	 isLeap=true;
			     }
			     else {
			    	 isLeap=false;
			     }
			if(isLeap==true) {
				System.out.println(y+ " is a Leap year.");
			}else {
				System.out.println(y+ " is not a Leap year.");
		}
	  }
	}
	