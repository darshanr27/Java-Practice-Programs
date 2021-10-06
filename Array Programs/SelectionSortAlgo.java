// Q: Write a java program to sort the array using selection sort algorithm.

import java.util.Scanner;

public class SelectionSortAlgo {
  
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length:");
		int len = scan.nextInt();
//		Creating the array
		int arr[] = new int[len];
//		Taking array elements from the user
		System.out.println("Enter array elements");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println("Enter an element:");
			arr[i] = scan.nextInt();
		}
//		Display array elements before sorting
		System.out.println("Array elements before sorting:");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		
//		Selection sort logic
		int min, pos, temp;
		for (int i = 0; i <= arr.length-2; i++) {
			min = arr[i];
			pos = i;
			for (int j = i+1; j <= arr.length-1; j++) {
				if(arr[j] < min) {
					min = arr[j];
					pos = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
		
//		Display array elements after sorting
		System.out.println();
		System.out.println("Array elements after sorting:");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
