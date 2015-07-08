package level2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q08 {

	public static void main(String[] args) {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number :");
		number = input.nextInt();
		
		ArrayList<Integer> divisors = findDivisors(number);
		System.out.println("The number of all divisors are : "+ divisors.size());
		System.out.println("the divisors are :" + divisors);

	}

	private static ArrayList<Integer> findDivisors(int number) {
		ArrayList<Integer> divisors = new ArrayList<Integer>();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0)
				divisors.add(i);
		}
		return divisors;
	}

}
