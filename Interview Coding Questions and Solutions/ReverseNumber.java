/*

Q: Write a java program to reverse a number.

Sample Input 1: 12345
Sample Output 1: 54321

Sample Input 3: -12345
Sample Output 3: -54321

*/

import java.util.Scanner;

public class ReverseNumber {
//Method to reverse the given number
	static void reverseNumber(int num) {
		int digit;
		int rev = 0;
		while(num != 0) {
			digit = num%10;
			rev = rev*10 + digit;
			num = num/10;
		}
		System.out.println("Reversed number:");
		System.out.println(rev);
    }
//	Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		reverseNumber(n);
		scan.close();
	}
}