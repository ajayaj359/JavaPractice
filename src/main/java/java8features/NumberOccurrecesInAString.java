package java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NumberOccurrecesInAString {
	
	
	static void numberOccirInAString(String str) {
		
		Map<String, Long> collect = Arrays.stream(str.split(""))
										.collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(collect);
		
		//str.chars().mapToObj((c->(char) c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
		
		
		Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(charCountMap);
		
		Map<Character, Long> collect2 = str.chars().mapToObj(c->(char) c)
		.filter(Character::isAlphabetic)
		.collect(Collectors.groupingBy(c-> c,Collectors.counting()));
		System.out.println(collect2);
		
	}
	

	public static void main(String[] args) {


		String str="where there is a will there is a way";
		numberOccirInAString(str);
		
	}

}
