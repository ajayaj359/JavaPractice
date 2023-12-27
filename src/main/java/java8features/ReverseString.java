package java8features;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

	static void reverseString() {
		String name = "registrotion";

		// IntStream.range(0, name.length()).mapToObj(i->
		// name.charAt(name.length()-i-1)).forEach(i->System.out.print(i));

		IntStream.range(0, name.length()).mapToObj(i -> name.charAt(name.length() - 1 - i)).map(String::valueOf)
				.collect(Collectors.joining());
	}

	static void reverseString123() {

		String name = "registrotion";
		String sorted = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			sorted = sorted + name.charAt(i);
		}
		System.out.println(sorted);

	}

	static void reverseString456() {
		String name = "happylove";

		String collect = name.chars().mapToObj(i -> String.valueOf((char) i))
				.collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					Collections.reverse(list);
					return list.stream().collect(Collectors.joining());
				}));
		System.out.println(collect);
		
		String collect2 = name.chars().sorted().mapToObj(i-> String.valueOf((char) i)).collect(Collectors.joining());
		System.out.println(collect2);
		
	}

	public static void main(String[] args) {

		// reverseString();
		// reverseString123();
		reverseString456();
		
	}

}
