package p1;
import java.util.HashMap;
import java.util.Map;

public class CountEachElementFromArray {
	public static void main(String[] args) {
		 
		int []arr= {10,10,20,30,60,60,20,5,5,5};
	
		Map<Integer , Integer> map= new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				
				map.put(arr[i], map.get(arr[i])+1);
				
			}else {
				map.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			
			System.out.println(entry.getKey()+ " = " +entry.getValue());
		}
	}
}