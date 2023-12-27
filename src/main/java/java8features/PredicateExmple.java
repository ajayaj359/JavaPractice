package java8features;

import java.util.function.Predicate;

public class PredicateExmple {

	public static void main(String[] args) {
	
		
		Predicate<String> checkLength=i -> i.length()>5;
		System.out.println("find String length :- " + checkLength.test("ajayaj"));
		
		Predicate<String> checkEven=i-> i.length()%2==0;
		System.out.println("filter Even number :-  "+ checkEven.test("iloveyou"));
		
		System.out.println("condetion on and :-" +checkLength.and(checkEven).test("love359happy"));
		System.out.println("condetion on or :-" +checkLength.or(checkEven).test("love359happy"));
		System.out.println("condetion on negate :-" +checkLength.negate().test("love359happy"));

		
	
	}

}
