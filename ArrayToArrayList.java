package p1;

import java.util.ArrayList;
import java.util.List;
//import java.util.Collections;
public class ArrayToArrayList{
	public static void main(String[]args) {
		String[] x= {"A"," B","3","D","ramesh","true"};
		
		List<String> ar=new ArrayList<>();
		
//		Collections.addAll(ar, x);
//		System.out.println(ar);
		for(String str:x) {
			ar.add(str);
		}
		System.out.println(ar);
	}
}
