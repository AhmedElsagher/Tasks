package level2;

import java.util.Scanner;

public class Q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter Decimal number ");
		int number=input.nextInt();
turn(number);
		
		

	}

	public static void turn(int number) {
		// TODO Auto-generated method stub
		StringBuilder binary=new StringBuilder();
	while (number>=0) {
		if (number%2==0&&number>0) {
			
			binary.append("0");
			number=number/2;
		}
		else	if (number%2==1) {
			binary.append("1");
			number=number/2;
		}
		else {
			break;
		}
	}
		
		System.out.println(binary.toString());
	}

}
