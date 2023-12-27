package java8features;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateBiFuntionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer, Integer> bp=(a,b)->(a+b)>5;
		System.out.println(bp.test(2, 6));
		System.out.println(bp.test(7, 9));
		
		BiFunction<Integer, Integer, Integer> bf=(a,b)->a*b;
		System.out.println(bf.apply(6, 8));
		System.out.println(bf.apply(9, 6));

	}

}
