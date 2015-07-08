package level1;

import java.util.Scanner;

public class Q1 {

	public final static double DISCOUNT =0.1 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price1, price2, price3,sum;
		Scanner input = new Scanner(System.in);
	
		 
		
		System.out.print("Item1 : ");
		price1 = input.nextDouble();
		System.out.print("Item2 : ");
		price2 = input.nextDouble();
		System.out.print("Item3 : ");
		price3= input.nextDouble();
		
		sum=price1+price2+price3;
		
		System.out.println("output");
		System.out.println("total price before dicount : " +sum);
		System.out.println("total price after dicount : " +sum*(1-DISCOUNT));
		

	}

}
