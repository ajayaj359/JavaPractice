package java8features;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TernaryOperationOnStreams {
	
	
	public static List<Integer> ternaryMethod(String input) {
		
		
		return input.equalsIgnoreCase("love")?IntStream.range(0, 10).filter(i->i%2 !=0).boxed().collect(Collectors.toList())
				:IntStream.range(0, 10).filter(i->i%2==0).boxed().collect(Collectors.toList());
		
		
	}

	public static void main(String[] args) {
		
		String str="love123";
		System.out.println(ternaryMethod(str));
		
		
		
		
		

	}

}
