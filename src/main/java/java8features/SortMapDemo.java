package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class SortMapDemo {
	
	
	static void narmulMethodToSort(Map map) {
		
		List<Entry<Integer,String>> listOfMap=new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
		Collections.sort(listOfMap, new Comparator<Entry<Integer, String>>() {

			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				
				return o1.getKey()-o2.getKey();
			}
		});
		
		for(Entry<Integer,String> ma:listOfMap) {
			System.out.println(ma.getKey() +"-----------"+ma.getValue());
		}
		
	}
	
	static void usingLamdhaSortMethod(Map map) {

		List<Entry<Integer, String>> listOfMap=new ArrayList<Map.Entry<Integer,String>>(map.entrySet());
		Collections.sort(listOfMap, (o1,o2)->o1.getKey()-o2.getKey());
		
		for(Entry<Integer,String> ma:listOfMap) {
			System.out.println(ma.getKey() +"-----------"+ma.getValue());
		}
		
	}
	
	static void java8Sort(Map map) {
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//map.entrySet().stream().sorted(().forEach(System.out::println);
	}
	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(11, "Ajay");
		map.put(12, "Demo");
		map.put(13, "Subi");
		map.put(14, "Ram");
		map.put(15, "map.put(11, \"Ajay\")enu");
		
		//narmulMethodToSort(map);
		map.forEach((k,v)->System.out.println(k+"---"+v));
		//usingLamdhaSortMethod(map);
		java8Sort(map);
	}

}


