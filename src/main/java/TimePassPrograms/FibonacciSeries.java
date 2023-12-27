package TimePassPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		
		System.out.println(" FibonacciSeries :::::");
		
		System.out.println("Give input ::::");
		
		Scanner sc=new Scanner(System.in);
		int input =sc.nextInt();
		
		
		int previous=0;
		int next=1;
		int result =0;
		
		for(int i=0;i<=input;) {
			System.out.println(previous+" ");

			result=previous+next;
			previous=next;
			next=result;
			i=previous;
		}
		
		

	}

}
