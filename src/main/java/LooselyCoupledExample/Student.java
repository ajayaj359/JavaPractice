package LooselyCoupledExample;

public class Student implements Human {

	@Override
	public void eat() {
		
		System.out.println("Student is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Student is sleeping");
		
	}

}
