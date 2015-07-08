package level2;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String choice;
		double totalPrice = 0;
		double[] price = { 9, 12, 11, 2, 1, 1.5 };
		System.out
				.printf("A for hotdog sandwich %1.1f $\nB for beef sandwich  %1.1f $\nC for chicken sandwich %1.1f $\nD for Pepsi  %1.1f $\nE for Potatoes  %1.1f$\nF for salad  %1.1f $\nN to end choosing",
						price[0], price[1], price[2], price[3], price[4],
						price[5]);
		System.out.print("\nEnter your order: ");
		choice = input.next();// how to conveert from string to character or how
								// to get character from user
		do {

			switch (choice) {
			case "A":
				totalPrice += price[0];
				break;
			case "B":
				totalPrice += price[1];
				break;
			case "C":
				totalPrice += price[2];
				break;
			case "D":
				totalPrice += price[3];
				break;
			case "E":
				totalPrice += price[4];
				break;
			case "F":
				totalPrice += price[5];
				break;
			case "N":
				System.out.println("end of choicing");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			if (!choice.equals("N")) {
				System.out.print("Enter your order: ");
				choice = input.next();
			}

		} while (!choice.equals("N"));
		System.out.println("u will pay " + totalPrice);
	}

}
