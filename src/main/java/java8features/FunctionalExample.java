package java8features;

import java.util.function.Function;

public class FunctionalExample {
	
	
	public static void main(String[] args) {
		
		Function<Integer, Integer> squreMe=i->i*i;
		System.out.println(squreMe.apply(6));
		
		
	}

}
