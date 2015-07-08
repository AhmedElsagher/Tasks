package level1;

import java.util.Scanner;

public class Q2 {

	public static final int SECONDPERMINUTE = 60;
	public static final int SECONDPERHOUR = 3600;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hours, minutes, seconds;
		int totalSecondPerMinute, totalSecondPerHours;
		int totalSeconds;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Hours:  ");
		hours = input.nextInt();
		System.out.print("Enter Minutes : ");
		minutes = input.nextInt();
		System.out.print("Enter Seconds : ");
		seconds = input.nextInt();

		totalSecondPerMinute = minutes * SECONDPERMINUTE;
		totalSecondPerHours = hours * SECONDPERHOUR;
		totalSeconds = seconds + totalSecondPerMinute + totalSecondPerHours;
	System.out.printf("\nHours: %d\nMinutes : %d\nSeconds :  %d\nTotal Seconds: %d" , hours,minutes,seconds,totalSeconds);
 
	/////////////////////		the next four line equal the prevoius line  //////////////////
	/* System.out.println();
		System.out.println("Hours: " + hours);
		System.out.println("Minutes :" + minutes);
		System.out.println("Seconds :" + seconds);
		System.out.println("Total Seconds: " + totalSeconds);*/

	}

}
