package TimePassPrograms;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {

		System.out.println(findSum1(5));
		System.out.println(findSum2(5));

	}

	private static int findSum2(int n) {

		return n * (n + 1) / 2;
	}

	private static int findSum1(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
