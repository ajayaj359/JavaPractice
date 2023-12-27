package RactivePrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	
	
	static void nameSearch(Item[] array1,Item[] array2) {
		
		List<String> collect = Arrays.stream(array1).flatMap(item->item.getUsers().stream())
		.map(user->user.getName()).collect(Collectors.toList());
		
		List<String> collect2 = Arrays.stream(array2).flatMap(item->item.getUsers().stream())
		.map(user->user.getName()).collect(Collectors.toList());
		
		List<String> collect3 = collect.stream().filter(collect2::contains).collect(Collectors.toList());
		System.err.println(collect3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item[] array1 = { new Item(1, Arrays.asList(new User("john", "engineer")), "ADMIN") };

		Item[] array2 = { new Item(2, Arrays.asList(new User("ram", "tester"), new User("john", "devopsengineer")),
				"SUPER_ADMIN") };

		nameSearch(array1,array2);
		
		List<User> users1 = array1[0].getUsers();
		List<User> users2 = array2[0].getUsers();
		//int j=users1.size()>users2.size()?users1.size():users2.size();
		for(int i=0;i<users1.size();i++) {
			
			for(int j=0;j<users2.size();j++) {
				
				if(users1.get(i).getName()==users2.get(j).getName()) {
					System.out.println(users2.get(j).getName());
				}
				
			}
			
			
		}
		

	}

}
