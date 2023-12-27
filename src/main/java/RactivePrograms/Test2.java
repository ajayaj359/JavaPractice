package RactivePrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
	
		List<Address> adrs=new ArrayList<Address>();

		adrs.add(new Address("uppal", 500031));
		adrs.add(new Address("RTC x Road", 500019));
		adrs.add(new Address("secodhrabadh", 500011));
		adrs.add(new Address("LB Nagar", 500023));
		adrs.add(new Address("Dhilship Nagar", 500051));
		
		System.out.println(adrs);
		Collections.sort(adrs); 
		System.out.println(adrs);
		
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee("Sravan", "Devalepor", 20000, new Phone("Sx123",12000)));
		empList.add(new Employee("Venumadhav", "Devalepor", 25000, new Phone("Sx123",16000)));
		empList.add(new Employee("Ramaya", "Devalepor", 19000, new Phone("Xz123",13000)));
		empList.add(new Employee("MayaDevi", "Devalepor", 34000, new Phone("Sx123",51000)));
		empList.add(new Employee("Laheri", "Devalepor", 87000, new Phone("Sx123",13000)));
		empList.add(new Employee("Anumath", "Devalepor", 90000, new Phone("S7123",5000)));
		empList.add(new Employee("Rajan", "Devalepor", 80000, new Phone("Sxc523",17000)));
		
		System.out.println(empList);
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return (int) (o1.getPhone().getPrice()-o2.getPhone().getPrice());
			}
		});

		System.out.println(empList);
	}

}
