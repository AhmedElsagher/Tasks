package level2;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int sumOfPostiveNumbers = 0;
		int productOfPostiveNumbers = 1;
		boolean anyNumbersExceptZero = false; // determine if the product will
																				// be zero or one
		Scanner input = new Scanner(System.in);
		System.out.println("enter a number: ");
		number = input.nextInt();
		while (number != 0) {
			if (number > 0) {
				anyNumbersExceptZero = true;
				sumOfPostiveNumbers += number;
				productOfPostiveNumbers *= number;
			} else if (number == 0)
				break;
			System.out.println("enter a number: ");
			number = input.nextInt();
		}
		System.out.println("The summation of all your positive numbers is :"
				+ sumOfPostiveNumbers);
		System.out.println("The product of all your positive numbers is :"
				+ ((anyNumbersExceptZero) ? productOfPostiveNumbers : 0));
	}

}
