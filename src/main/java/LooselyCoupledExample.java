interface Human{
	
	void eat();
	void sleep();
}

class Student implements Human{

	@Override
	public void eat() {
	
		System.out.println("Student is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Student is sleeping");
		
	}
	
}

class Emplooye{
	
	private Human humanRef;
	
	public void setRef(Human humanRef) {
		this.humanRef=humanRef;
	}
	
	public void empFunction() {
		humanRef.eat();
		humanRef.sleep();
	}


public class LooselyCoupledExample {

	public static void main(String[] args) {
		
		Human std=new Student();
		
		Emplooye emp=new Emplooye();
		emp.setRef(std);
		emp.empFunction();
	}
	
	}

}
