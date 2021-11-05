/*

Q: Write a java program to find the factorial of a number using recursion.
Sample Input: 5
Sample Output: 120

*/ 

import java.util.Scanner;
public class Factorial {
//	Method to find the recursion of the number using recursion
	static int findFactorial(int n) {
			if(n==0)
				return 1;
			else
				return (n*findFactorial(n-1));
	}
//	Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		int fact = findFactorial(num);
		System.out.println("Factorial of " + num + " is " + fact);
		scan.close();
	}
}