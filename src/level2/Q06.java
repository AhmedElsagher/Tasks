package level2;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("enter n :");
		n = input.nextInt();

		System.out.println("sum of odds"+sumOfOdds(n));
		System.out.println("sum of evens"+sumOfEvens(n));
		System.out.println("average Of Evens"+averageOfEvens(n));
		System.out.println("average Of Odds"+averageOfOdds(n));

	}

	private static int sumOfEvens(int n) {
		int sum = 0;
		// TODO Auto-generated method stub
		for (int i = n; i >= 0; i--) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		return sum;
	}

	private static int sumOfOdds(int n) {

		int sum = 0;

		for (int i = n; i >= 0; i--) {
			if (i % 2 != 0) {
				sum += i;
			}
		}

		return sum;
	}

	private static int averageOfEvens(int n) {
		int sum = 0;
		int count = 0;
	 
		for (int i = n; i >= 0; i--) {
			if (i % 2 == 0) {
				sum += i;
				count++;
			}
		}

		return sum / count;
	}

	private static int averageOfOdds(int n) {

		int sum = 0;
		int count = 0;
		;
		for (int i = n; i >= 0; i--) {
			if (i % 2 != 0) {
				sum += i;
				count++;
			}
		}

		return sum / count;
	}
}
