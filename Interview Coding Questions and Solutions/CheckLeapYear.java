/*

Q: Write a program to check if the year is leap or not.
Exaplaintation: Leap year is a year which is divisible by 4 but not by 100, if the year is divisible by 400 then it is a leap year.
Sample Input: 2016
Sample Output: Leap Year

*/

import java.util.Scanner;
public class CheckLeapYear {
//	Method to check the year is leap or not
	static void checkLeap(int year) {
//		Condition to check the year is leap or not
		if((year%4 == 0 && year%100 !=0) || year%400 == 0) 
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
//	Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scan.nextInt();
		checkLeap(year);
		scan.close();
	}
}