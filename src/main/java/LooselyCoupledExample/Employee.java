package LooselyCoupledExample;

public class Employee {
	
	private Human humanRef;
	
	public void setRef(Human ref) {
		this.humanRef=ref;
	}
	
	public void employeeFunctionality() {
		humanRef.eat();
		humanRef.sleep();
	}

}
