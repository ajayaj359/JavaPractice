package RactivePrograms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Bubblesort {

	public static void sortArray() {

		int[] inta = { 12, 34, 56, 78 };
		int size = inta.length;
		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < size; i++) {
				if (inta[i - 1] > inta[i]) {
					int temp = inta[i];
					inta[i] = inta[i - 1];
					inta[i] = temp;
					swapped = true;
				}
			}
		} while (swapped);
		
		for(int in:inta) {
			System.out.println(in);
		}

	}
	
	public static void bubbleSort() {
		
		int[] arr= {1,45,6,3,52,67};
		int l=arr.length;
		boolean swapped;
		for(int i=0;i<l-1;i++) {
			swapped=false;
			for(int j=0;j<l-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			
			if(!swapped) {
				break;
			}
		}
		
		for(int ar:arr) {
			System.out.println(ar);
		}
		
	}
	public static void reverse() {
		String str="registation";
		String collect = IntStream.range(0,str.length()).mapToObj(i->str.charAt(str.length()-i-1)).map(String::valueOf).collect(Collectors.joining());
		System.out.println(collect);
		
		//IntStream.range(0, str.length()).map(i->str.charAt(str.length()-i-1)).map(String::valueOf).boxed().collect(Collectors.joining());
	
		long count = str.chars().sorted().count();
	}
	
	public static void selectionSort() {
		
		int[] arr= {1,45,6,3,52,67};
		int l=arr.length;
		int minIndex;
		for(int i=0;i<l-1;i++) {
			minIndex=i;
			for(int j=i+1;j<l;j++) {
				
				if(arr[j]<arr[minIndex])
					minIndex=j;
				
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		sortArray();
		bubbleSort();
		reverse();
	}

}
