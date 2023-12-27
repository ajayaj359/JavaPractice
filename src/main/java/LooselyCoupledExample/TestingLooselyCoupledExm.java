package LooselyCoupledExample;

import java.util.LinkedList;

public class TestingLooselyCoupledExm {

	public static void main(String[] args) {
		
		Human humref=new Student();
		Employee emp=new Employee();
		emp.setRef(humref);
		emp.employeeFunctionality();

		
		
		LinkedList<Integer> add=new LinkedList<Integer>();
		
		
	  double num=23.76846782672;
	  
      double formattedValue = Math.round(num);
	  
	  System.out.println(formattedValue);
		
	}

}
