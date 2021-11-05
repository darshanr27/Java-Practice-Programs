/*

Q: Write a java program to print all the prime numbers in a given interval.


*/

import java.util.Scanner;
public class PrintPrime {
//	Method to print the prime number in the given range
	static void printPrime(int start, int end) {
		System.out.println("Prime numbers between " + start + " and " + end + " are:");
		int count;
//		Looping the number from start to end
		for(int i = start; i <= end; i++) {
			count = 0;
//			Check if the number is prime and if it is prime then print
			for (int j = 2; j <= i/2; j++) {
				if(i % j == 0) {
					count++;
					break;
				}
			}
			if(count == 0) {
				System.out.print(i + " ");
			}
		}
	}
//	Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting number: ");
		int start = scan.nextInt();
		System.out.println("Enter the ending number: ");
		int end = scan.nextInt(); 
		printPrime(start, end);
		scan.close();
	}
}