/*

Q: Write a java program to check if a given string is a palindrome or not.

Sample Input: malayalam
Sample Output: Entered string is a palindrome.

*/

import java.util.Scanner;

public class Palindrome {
//Method to check if the given string is palindrome or not
	static void checkPalindrome(String str) {
		String revstr = "";
//		Loop for reversing the string
		for(int i = str.length()-1; i >=  0; i--) {
			revstr += str.charAt(i);  
		}
//		Condition checking if the reversed string is equals to main string or not
		if(str.equalsIgnoreCase(revstr)) {
			System.out.println("Entered string is a palindrome");
		}
		else {
			System.out.println("Entered string is not a palindrome");
		}
    }
//	Main method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scan.next();
		checkPalindrome(str);
		scan.close();
	}
}