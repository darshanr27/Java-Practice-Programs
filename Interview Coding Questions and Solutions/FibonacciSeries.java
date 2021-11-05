/*

Q: Write a java program to print the Fibonacci series upto n terms.
Explanation: The Fibonacci series is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next number is found by adding up the two numbers before it.
Sample Input: 5
Sample Output: 0 1 1 2 3 5

*/

import java.util.Scanner;
public class Demo {
//	Method to print the Armstrong numbers in the given range
	static void printFibonacciSeries(int limit) {
		if(limit > 0) {
			int first = 0, second = 1;
			System.out.println("Fibonacci series upto " + limit + " are:");
			System.out.print(first + " " + second);
			int sum;
			while(second <= limit) {
				sum = first + second;
				first = second;
				second = sum;
//				Condition to check the number to printed must be less than limit
				if(sum <= limit)
					System.out.print(" " + sum);
			}
		}
		else {
			System.out.println("Wrong input...! Try again");
		}
	}
//	Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int limit = scan.nextInt();
		printFibonacciSeries(limit);
		scan.close();
	}
}