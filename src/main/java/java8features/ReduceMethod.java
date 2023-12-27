package java8features;

import java.util.Arrays;
import java.util.Optional;

public class ReduceMethod {
	
	
	public static void main(String[] args) {
		
		int[] numbers= {1,2,3,4,5,6};
		
		int reduce = Arrays.stream(numbers).reduce(0,(a,b)->a+b);
		System.out.println(reduce);
		
		String[] str= {"ajay","subi","love","happy","peace"};
		String[] array = Arrays.stream(str).map(i->i.toUpperCase()).toArray(String[]::new);
		System.out.println(Arrays.toString(array)); //it will give content of Array
		System.out.println(array.toString());       //it will give address reference of Array
		
		
		Integer findAny = (Integer) Arrays.asList(3,4,5,6,7,8,9).stream().max((i,j)-> i>j?i:j).get();
		System.out.println(findAny);
		
		
		
		
		
		 
	}

}
