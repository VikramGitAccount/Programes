package p1;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateFromArrayList {
	public static void main(String[] args) {
		List<Integer> arr=  Arrays.asList(10,30,20,10,30,20);
		
		HashSet<Integer> num = new HashSet<>();
		for(int i=0; i<arr.size(); i++) {
			num.add(arr.get(i));
		
		}
		System.out.println(num);
	}
}
