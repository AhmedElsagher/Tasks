package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.println("Enter numbers (less than 0 to end) :");
		number = input.nextInt();
		while (number >= 0) {

			array.add(number);
			number = input.nextInt();
		}
		int[] intArray = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			intArray[i] = array.get(i);

		}
		Arrays.sort(intArray);
		System.out.println("the minmium two numbers is " + intArray[0] + "  "
				+ intArray[1]);
		System.out.println("the maximum two numbers is "
				+ intArray[intArray.length - 1] + "  "
				+ intArray[intArray.length - 2]);

	}

}
