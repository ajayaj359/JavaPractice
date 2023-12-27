package java8features;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> sup=()->"Supplier is only return anything, it won't take any input, it does not have any chaining methods";
		System.out.println(sup.get());

	}

}
