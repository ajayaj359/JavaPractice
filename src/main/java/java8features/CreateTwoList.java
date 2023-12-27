package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateTwoList {

	public static void divideList() {
		String test = "234ashfk897237";

		String collect = test.chars().filter(Character::isLetter).mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());

		String collect2 = test.chars().filter(Character::isDigit).mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());

	}
	
	public static void divideCharAndNumber() {
		
		String test="234ashfk890";
		ArrayList<Integer> alnum=new ArrayList<>();
		ArrayList<Object> alstr=new ArrayList<Object>();
		
		test.chars().forEach(c ->{
			if(Character.isDigit(c)) {
				alnum.add(Character.getNumericValue(c));
			}else {
				alstr.add((char) c);
			}
		});
		
		System.out.println(alnum);
		System.out.println(alstr);
	}

	public static void main(String[] args) {

		divideCharAndNumber();
	}
}