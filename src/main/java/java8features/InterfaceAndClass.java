package java8features;


class Student{
	String name;
	String deportment;
	int age;
	int rollNo;
	public Student(String name, String deportment, int age, int rollNo) {
		super();
		this.name = name;
		this.deportment = deportment;
		this.age = age;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", deportment=" + deportment + ", age=" + age + ", rollNo=" + rollNo + "]";
	}	
	
}

interface Interf{
	Student	get(String name,String deportment,int age,int rollNo);
}
public class InterfaceAndClass {
	
	public static void main(String[] args) {
		Interf i=(name,deportment,age,rollNo) -> new Student(name,deportment,age,rollNo);
		i.get("ajay", "software",23, 34);
	
	}
	
}
