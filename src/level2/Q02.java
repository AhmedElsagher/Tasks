package level2;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, m, n;
		int sum;
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number: ");
		x = input.nextInt();
		m = leastPrimeGreaterThanX(x);
		n = greatestPrimeLessThanX(x);
		sum = m + n;
		System.out.println("M =" + m);
		System.out.println("n=" + n);
		System.out.println("M+N =" + sum);

	}

	private static int greatestPrimeLessThanX(int x) {
		// TODO Auto-generated method stub
		int n = x - 1;//decrement by 1
		while (n > 1) {

			if (isPrime(n)) {
				return n;
			}
			n--;

		}
		return 0;
	}

	public static boolean isPrime(int x) {
	 
		if (x == 1) {//u avoid making m=1 if   x =0 
			return false;
		}

		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				return false;
			}
		}

		return true;
	}

	private static int leastPrimeGreaterThanX(int x) {
	 
		int m = x + 1;// increment by one

		while (m > x) {

			if (isPrime(m)) {
				return m;
			}
			m++;

		}

		return m;//no use of this line
	}

}
