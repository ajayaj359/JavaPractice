package java8features;

import java.util.List;

public class Employee {

	
	String empName;
	double salary;
	List<String> project;
	String address;
	
	
	public Employee(String empName, double salary, List<String> project, String address) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.project = project;
		this.address = address;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public List<String> getProject() {
		return project;
	}
	public void setProject(List<String> project) {
		this.project = project;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + ", project=" + project + ", address=" + address
				+ "]";
	}
	
	


}
