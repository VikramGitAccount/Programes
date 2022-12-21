package p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,60,6,3,9);
		Collections.reverse(list);
		System.out.println(list);
	}
}
