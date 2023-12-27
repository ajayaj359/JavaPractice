package RactivePrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void sorting() {

		List<Integer> list = Arrays.asList(1, 3, 4, 5, 2, 9, 6);

		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				
				if(list.get(i)<list.get(j)) {
					int e= list.get(j);
					list.add(i,e);
				}
			}
		}
		System.out.println(list);

	}
	
	public static void sortingWithOutUsingMethods() {
		int[] number= {5,2,9,1,5,6};
		dubbleSort(number);
		for(int num:number) {
			System.out.print(num);
		}
	}
	

	private static void dubbleSort(int[] arr) {
		int n=arr.length;
		boolean swapped;
		
		do{
			swapped=false;
			for(int i=1;i<n;i++) {
				if(arr[i-1]>arr[i]) {
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
					swapped=true;
				}
			}
		}while(swapped);
		
		
		
	}

	public static void findOutThehightPriceOfPhone() {

		List<Employee> listOfemp = Arrays.asList(new Employee("haapy", "love", 1000, new Phone("love123", 10123)),
				new Employee("peace", "understanding", 2000, new Phone("peace345", 1123)),
				new Employee("patience", "let go of verything", 3000, new Phone("acceptance897", 42366)),
				new Employee("acceptance", "love", 4000, new Phone("happy975", 563532)));

		// listOfemp.stream().filter(e->e.getSalary()>1000).forEach(e->
		// System.out.println(e));
		//listOfemp.stream().filter(e -> e.getPhone().getPrice() > 40000).forEach(e -> System.out.println(e));

		sortByEmployeeSalary(listOfemp);
	}
	
	public static void sortByEmployeeSalary(List<Employee> list) {
		
		list.stream().map(e->e.getSalary()).sorted(Collections.reverseOrder()).forEach(e ->System.out.println(e));;

		List<Employee> collect = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(collect);
	}
	

	public static void main(String[] args) {

		findOutThehightPriceOfPhone();
		//sorting();
		//sortingWithOutUsingMethods();
		
		
	}

}
