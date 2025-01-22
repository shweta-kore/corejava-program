package ANP_D0453;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input a year
		System.out.print("Enter a year: ");
		int year = scanner.nextInt();

		// Check if the year is a leap year
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " is a leap year.");
				} else {
					System.out.println(year + " is not a leap year.");
				}
			} else {
				System.out.println(year + " is a leap year.");
			}
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}

}
//OUTPUT


/*

*Enter a year: 2003
2003 is not a leap year.
*

*/    