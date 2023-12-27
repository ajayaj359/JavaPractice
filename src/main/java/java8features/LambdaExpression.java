package java8features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

interface Calculation{
	
	int sub(int a,int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		
		Calculation cclt=(a, b) ->{
			if(a<b) {
				throw new RuntimeException("will get the negate value");
			}else {
				return a-b;
			}
			
		};
		
		System.out.println(cclt.sub(12, 10));
		
		
		List<Integer> li=Arrays.asList(12,34,54,67,89);
		//li.stream().sorted(Collections.reverseOrder()).forEach(i->System.out.println(i));
		//li.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.print(i +" "));
		li.stream().sorted(Comparator.comparingInt(Integer::intValue)).forEach(i->System.out.println(i));;
		li.stream().sorted((e,f)->f-e).forEach(System.out::print);
		

	}

}
