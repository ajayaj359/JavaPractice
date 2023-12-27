package MarkerInterFace;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	private String empName;
	private int salary;
	
	public Employee(String empName, int salary) {
		super();
		this.empName = empName;
		this.salary = salary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}



public class SerializationExample {
	
	
	
	public static void serialization()throws IOException {
		
	Employee emp=new Employee("ajay", 2355);
		
		FileOutputStream fos=new FileOutputStream("employeedata.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.flush();
		oos.close();
		System.out.println("serialization done");
	}
	
	public static void DeserializationExample  () throws IOException, ClassNotFoundException {
		
		FileInputStream fis=new FileInputStream("employeedata.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee emp=(Employee) ois.readObject();
		System.out.println(emp.getSalary() +"------"+emp.getEmpName());
		
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		
	
		//serialization();
		DeserializationExample();
		
	}

}
