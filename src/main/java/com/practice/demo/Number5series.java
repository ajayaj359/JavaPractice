package com.practice.demo;

public class Number5series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 50;

		for (int i = 0; i < num; i = i + 5) {

			if (i % 5 == 0) {
				System.out.println(i);
			}

		}
		
		for(int i=0,j=10,k=1;i<10 && j<12 || 7>k;i++,j++,k++) {
			System.out.println( i +"  "+j+"  "+k);
		}
	}
}