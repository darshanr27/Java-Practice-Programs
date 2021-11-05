/*

Q: Write a java program to check whether a given number is Armstrong number or not.
Explainaion(case - sfor 3 digits number): An Armstrong number is a number whose sum of cubes of its digits is equal to the number itself.

Example for Armstrong number(3 digit numbers): 153, 370, 371, 407.

*/

import java.util.Scanner;
public class ArmstrongNumber {
//Method to check if the given number is armstrong number or not
	static void checkArmstrong(int num) {
		int temp = num;
		int sum = 0;
		int digit;
		while(num != 0) {
			digit = num % 10;
			sum += (digit * digit * digit);
			num = num /10;
		}
		if(temp == sum)
			System.out.println( temp + " is an Armstrong number");
		else
			System.out.println(temp + " is not an Armstrong number");
	}
//	Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		checkArmstrong(num);
	}
}