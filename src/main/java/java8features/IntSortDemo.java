package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntSortDemo {
	
	
	public static void main(String[] args) {
		
		List<Integer> of = Arrays.asList(10,2,32,87,45,1,34,54);
		Integer integer = of.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println(integer);
		
		Integer integer2 = of.stream().min((i,j)->i.compareTo(j)).get();
		System.out.println(integer2);
		
		Integer integer3 = of.stream().max((i,j)->j.compareTo(i)).get();
		System.out.println(integer3);
	}

}
