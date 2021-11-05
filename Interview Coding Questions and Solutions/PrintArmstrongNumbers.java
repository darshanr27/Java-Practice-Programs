/*

Q: Write a java program to print all the Armstrong numbers between given range.
Explainaion: An Armstrong number is an integer such that the sum of the respective power of its digits is equal to the number itself.
Sample Input: 1, 999.
Sample Output: 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407.

*/

import java.util.Scanner;

public class PrintArmstrongNumbers {
//Method to print the Armstrong number in the given range
	static void printArmstrongNumber(int low, int high) {
		System.out.println("Armstrong numbers in the range of " + low + " and " + high);
//		Looping through the numbers in the given range
		for(int num = low; num <= high; num++) {
			int temp = num;
			int digitCount = 0;
			int digit;
			int sum = 0;
//			Looping for counting the number of digits
			while(temp != 0) {
				temp = temp / 10;
				digitCount++;
			}
//			Resetting the temp
			temp = num;
//			Finding the sum of the respective power of the digits in the number
			while(temp != 0) {
				digit = temp % 10;
				sum = (int) (sum + Math.pow(digit, digitCount));
				temp = temp /10;
			}
//			Checking and printing only if the number is Armstrong number
			if(num == sum)
				System.out.print(num + " ");
		}
	}
    
//	Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a starting number:");
		int start = scan.nextInt();
		System.out.println("Enter a ending number:");
		int end = scan.nextInt();
		printArmstrongNumber(start, end);
		scan.close();
	}
}