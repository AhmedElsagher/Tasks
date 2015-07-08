package level2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("sample");
		int number = input.nextInt();
		System.out.println(findSolution(number));

	}

	public static int findSolution(int number) {
		// TODO Auto-generated method stub
		int product = 2;
		for (int i = 3; i <= number; i++) 
		{
			if (number % i == 0 && IsPrime(i)) {
				product *= i;
			}

		}
		return product;
	}

	private static boolean IsPrime(int i)
	{
		// TODO Auto-generated method stub
		for (int j = 2; j < i ; j++)
		{
			if (i % j == 0) 
			{
				return false;
			}
		}
		return true;
	}

}
