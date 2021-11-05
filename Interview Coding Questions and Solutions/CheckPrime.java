/*

Q: Write a java program to check if the number is prime or not.
Explaination: Prime number is a number which is divisible only by itself and 1.

*/

import java.util.Scanner;
public class CheckPrime {
//	Method to check the number is prime or not
	static void checkPrime(int num) {
		int count = 0;
//		Condition to get the check factors for the number
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				count++;
				break;
			}
		}
		
//		Number is prime if the count increases else number is not a prime
		if(count == 0)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
//	Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scan.nextInt();
		checkPrime(n);
		scan.close();
	}
}