package p1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountNoOfWordOccurance {

	public static void main(String[] args) {
		String str= "my name is neuton neuton is a scientist";
		
		List<String > words=Arrays.asList(str.split(" "));
		System.out.println(words);
		
		Map<String, Long> map= words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
				System.out.println(map);
	}
}
