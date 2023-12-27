package com.practice.demo;

import java.util.Scanner;

public class AddAllEvenNumbersFromTheGivenRange {
	
	//2
	static void method1(int num1,int num2) {
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			
			if(i%2==0) {
				System.out.print(i+"+");
				sum=sum+i;
			}
		}
		
		System.out.println(" = "+sum);
		
	}
	//3
	static void method2 (int num1,int num2) {
		int sum=0;
		int len=0;
		System.out.print("(");
		for(int i=num1;i<=num2;i++) {
			if(i%2==0) {
				System.out.print(i+"+");
				sum=sum+i;
				len++;
			}
		}
		
		System.out.println(")/"+len+" = "+sum/len);
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value :--");
		int num1=sc.nextInt();
		System.out.println("enter second value :--");
		int num2=sc.nextInt();
		//1
		int sum=0;
		for(int i=num1;i<=num2;i++) {
			
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("sum of all even numbers is ::- "+ sum);
		
		method1(num1,num2);
		method2(num1,num2);
		
	}
	

}
