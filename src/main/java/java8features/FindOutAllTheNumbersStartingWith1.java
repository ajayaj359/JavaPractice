package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindOutAllTheNumbersStartingWith1 {

	public static void filerstaringWith1Number() {

		List<Integer> listOfInteger = Arrays.asList(23, 45, 12, 45, 123, 145, 968, 1567);
//		List<Integer> collect = listOfInteger.stream().filter(i -> {
//
//			int num=i;
//			while (num > 1) {
//				int num1 = num / 10;
//				num = num1;
//			}
//			if (num == 1) {
//				return true;
//			} else {
//				return false;
//			}
//		}).collect(Collectors.toList());
		
		List<Integer> collect = listOfInteger.stream().filter(i->{
			String str=String.valueOf(i);
			if(str.startsWith("1")) {
				return true;
			}else {
				return false;
			}
		}).collect(Collectors.toList());
		
		System.out.println(collect);
	}

	public static void main(String[] args) {

		filerstaringWith1Number();
	}

}
