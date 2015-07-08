package level2;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m, n;
		boolean coprime;
		Scanner input = new Scanner(System.in);
	
		System.out.print("enter the First number: ");
		m = input.nextInt();
		System.out.print("enter the Second number: ");
		n = input.nextInt();
	
		coprime = gcdIsOne(m, n);
		System.out.println(coprime ? "yes" : "no");

	}

	private static boolean gcdIsOne(int m, int n) {
		// TODO Auto-generated method stub
		int gcd = 1;
		int k = 2;
		if (m % n == 0 || n % m == 0)
			return false;
		while (k < m && k < n) {
			if (m % k == 0 && n % k == 0)
				return false;
			k++;
		}
		return true;
	}

}
