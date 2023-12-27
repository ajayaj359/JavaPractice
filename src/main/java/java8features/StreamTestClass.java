package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTestClass {
	
	public static void main(String[] args) {
		
		List<Employee> emplist=new ArrayList<>();
		
		emplist.add(new Employee("ajay",1000,Arrays.asList("q","r","y"),"hyd"));
		emplist.add(new Employee("thanu",1010,Arrays.asList("e","i","l"),"hyd"));
		emplist.add(new Employee("ramu",1040,Arrays.asList("q","r","m"),"hyd"));
		emplist.add(new Employee("gayatri",1600,Arrays.asList("q","p","r"),"hyd"));
		emplist.add(new Employee("shiva",1800,Arrays.asList("q","s","n"),"hyd"));
		emplist.add(new Employee("Shravan",1900,Arrays.asList("q","c","g"),"hyd"));
		
		List<Employee> collect = emplist.stream().filter(emp->emp.getSalary()>1500).collect(Collectors.toList());
		System.out.println(collect);
		
		emplist.stream().map(emp->emp.getProject()).flatMap(p->p.stream()).forEach(System.out::print);
		
		emplist.stream().map(emp-> new Employee(
				                    emp.getEmpName(),
									emp.getSalary()*1.10,
									emp.getProject(),
									emp.getAddress())).forEach(System.out::println);
		System.out.println("---------------------------------------------------------------------------------");
		emplist.stream().filter(emp->emp.getSalary()>1600).map(emp->new Employee( emp.getEmpName(),
									emp.getSalary()*1.10,
									emp.getProject(),
									emp.getAddress())).forEach(System.out::println);
		
	}

}
