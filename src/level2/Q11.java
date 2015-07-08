package level2;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base;
		int power;
		boolean doYouWantAnother = true;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base :");
		base = input.nextInt();
		System.out.print("Enter the power :");
		power = input.nextInt();
		String askForContinouing;
		while (doYouWantAnother) {
			if (power >= 0)
				System.out.println("the result is " + (int)Math.pow(base, power));
			else
				System.out.println("error power is negtive ");
			System.out.print("Do another? (y/n): ");
			askForContinouing = input.next();
			doYouWantAnother = (askForContinouing.equals("y") ? true : false);
			if (doYouWantAnother) {
				System.out.print("Enter the base :");
				base = input.nextInt();
				System.out.print("Enter the power :");
				power = input.nextInt();
			}

		}
	}

}
