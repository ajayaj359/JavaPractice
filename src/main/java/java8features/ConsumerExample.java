package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	

	public static void main(String[] args) {
	
		
		Consumer<Integer> squar=i-> System.out.println("Consumer won't return anything :- "+ i*i);
		squar.accept(5);
		
		Consumer<Integer> doublenum=i->System.out.println("Consuner has accpet Method :- "+ i*5);
		doublenum.accept(5);
		
		Consumer<Integer> sq=i -> squar.andThen(doublenum).accept(i);
		
		//consumerChaining
		squar.andThen(doublenum).accept(6);
		
		List<Integer> in=Arrays.asList(2,4,67,73,2,4);
		
		in.stream().forEach(sq);

	}

}
