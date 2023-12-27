package java8features;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class A {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "laik123");
		map.put(3, "kani456");
		map.put(4, "mani456");
		map.put(2, "yaja123");
		
		map.forEach((k,v)-> System.out.println(k+"  "+v));
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new))
		.forEach((k,v)->System.out.println(k +"----->"+v));

		System.out.println();
	}

}
