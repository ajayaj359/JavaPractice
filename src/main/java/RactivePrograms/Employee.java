package RactivePrograms;

public class Employee  {
	
	private String name;
	private String depatment;
	private long salary;
	private Phone phone;
	
	public Employee(String name, String depatment, long salary, Phone phone) {
		super();
		this.name = name;
		this.depatment = depatment;
		this.salary = salary;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepatment() {
		return depatment;
	}
	public void setDepatment(String depatment) {
		this.depatment = depatment;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", depatment=" + depatment + ", salary=" + salary + ", phone=" + phone + "]";
	}
	
	

}
