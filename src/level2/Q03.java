package level2;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number : ");
		// System.out.println(3<=3.0&& 2>=2.0);
		number = input.nextInt();
		System.out.println(findNWays(number));

	}

	private static int findNWays(int number) {

		int nWays = 0;
		int m, n;
		// start from 2 because the first prime number is 2
		m = number - 2;
		n = 2;

		while (m >= 2 && n <= number - 2) {
			if (m + n == number && isPrime(m) && isPrime(n))
				nWays++;
			m--;
			n++;

		}
		return nWays;
	}

	public static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}

}
