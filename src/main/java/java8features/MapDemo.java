package java8features;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapDemo {
	
	
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap();
		map.put(2, "ajay");
		map.put(3, "jay");
		map.put(4, "anu");
		map.put(5, "venu");
		map.put(6, "ramu");
		
		List<Entry<Integer, String>> collect = map.entrySet().stream().filter(i->i.getKey()%2==0).collect(Collectors.toList());
		System.out.println(collect); 
		collect.forEach(i->System.out.println(i.getKey()+"-------"+i.getValue()));
		
		
	}

}
