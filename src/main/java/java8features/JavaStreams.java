package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreams {
	
	
	static void filterAndSumEven(List<Integer> listOfInteger) {
		Integer reduce = listOfInteger.stream().filter(i->i%2 ==0).reduce(0,(i,j)->i+j);
		System.out.println(reduce);
	}
	
	static void  filterAndCountLessThenLenth4(List<String> listOfString) {
		int size = listOfString.stream().filter(str->str.length()<=4).collect(Collectors.toList()).size();
		System.out.println(size);
	}
	
	static void TransformAndCollectToUppercase(List<String> listOfString) {
		List<String> collect = listOfString.stream().map(str-> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
	}

	public static void main(String[] args) {
		
		List<Integer> listOfInteger =Arrays.asList(12,45,6,24,7,8,45,97);
		filterAndSumEven(listOfInteger);
		
		List<String> listOfString = Arrays.asList("ajay","love","peace","happy","patience","aceptices");
		
		filterAndCountLessThenLenth4(listOfString);
		TransformAndCollectToUppercase(listOfString);
	}

}
