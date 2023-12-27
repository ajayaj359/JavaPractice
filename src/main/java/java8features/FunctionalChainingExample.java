package java8features;

import java.util.function.Function;

public class FunctionalChainingExample {

	public static void main(String[] args) {

		Function<Integer, Integer> doublenum=i->i*2;
		System.out.println("Just double the integer ;-" +doublenum.apply(4));
		
		Function<Integer, Integer> cub=i->i*i*i;
		System.out.println("Just cub the integer :- "+ cub.apply(4));
		
		System.out.println("first doubling using apply :-  "+doublenum.andThen(cub).apply(4));
		System.out.println("frist cubing using apply :-   "+ doublenum.compose(cub).apply(4));
 		
	}

}
