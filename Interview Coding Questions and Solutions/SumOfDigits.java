/*

Q: Write a java program to find the sum of digits of a number.
Sample Input: 12345
Sample Output: 15

*/

import java.util.Scanner;
public class SumOfDigits {
//Method to find the sum of the digits of the number
	static void findDigitSum(int num) {
		int digit, sum = 0;
		while(num > 0) {
			digit = num%10;
			sum += digit;
			num = num/10;
		}
		System.out.println(sum);
	}
//	Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		findDigitSum(n);
		scan.close();
	}
}