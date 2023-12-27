package java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FindMaxValueDefft {
	
	

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(23,359,4,12,108,45,6,45,98);
		Optional<Integer> max = list.stream().max(Integer::compareTo);
		System.out.println(max.get());
		
		
		
		
		
		int max1=Integer.MIN_VALUE;
		for(int num:list) {
			if(num>max1)
				max1=num;		
		}
		System.out.println(max1);
		
		Integer reduce = list.stream().reduce(Integer.MIN_VALUE,Integer::max);
		System.out.println(reduce);
		
		Integer integer = Collections.max(list);
		System.out.println(integer);
		
		Integer reduce2 = list.stream().reduce(Integer.MIN_VALUE,(i,j)->i>j?i:j);
		System.out.println(reduce2);
		
		int min1=Integer.MAX_VALUE;
		System.out.println(min1);
		
	}

}
