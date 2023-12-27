package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PeekDemo {

	public static void main(String[] args) {
		
			List<Integer> pk=Arrays.asList(2,3,4,5,6,7,8,9);
		System.out.println(	pk.stream().filter(i-> i%2==0).map(a->a+a).filter(i-> i>10));
		
		
		//reduce method
		List<String> list=Arrays.asList("ajay","rahul","aruna","yadhaiah");
		System.out.println(list.stream().reduce((w1,w2)-> w1.length()>w2.length()?w1:w2).get());
		
		//find all elements in form array who start with 1
		List<Integer> listInt=Arrays.asList(12,43,15,61,16,81);
		Set<String> collect = listInt.stream().map(x->String.valueOf(x)).peek(e->System.out.println(e)).filter(i->i.startsWith("1")).collect(Collectors.toSet());
		System.out.println(collect);
		
		boolean noneMatch = listInt.stream().noneMatch(i->i%2==0);
		
		System.out.println(noneMatch);
		
	}
}
