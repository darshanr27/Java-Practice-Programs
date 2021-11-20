/*

Q: Write a java program to check whether two strings are anagram or not.
Explaination: An anagram is a word, phrase, or name formed by rearranging the letters of another, such as cinema, formed from iceman.

Sample Input: Listen, Silent
Sample Output: Anagram

Sample Input: Tic, Tac
Sample Output: Not Anagram

*/

import java.util.Scanner;
import java.util.Arrays;

public class Anagram
{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = scan.nextLine();
        System.out.println("Enter second string:");
        String str2 = scan.nextLine();
        // Initially checking if the length of both strings are same or not if not then printing not anagram  and exiting the program
        if(str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            System.exit(0);
        }
        //If the length of both strings are same then converting both strings to lower case character array and sorting them
        char []arr1 = str1.toLowerCase().toCharArray();
        char []arr2 = str2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        //Comparing the sorted arrays and printing the result
        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}