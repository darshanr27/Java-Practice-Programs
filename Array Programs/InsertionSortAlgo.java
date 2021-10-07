// Write a java program to sort the integer type array using insertion sort algorithm.

import java.util.Scanner;

public class InsertionSortAlgo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int len = scan.nextInt();
//		Create the array
		int[] arr = new int[len];
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an element:");
			arr[i] = scan.nextInt();
		}
//		Display array elements before sorting
		System.out.println("Array elements before sorting");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		
//		Insertion Sort Logic
		int item, j;
		for(int i = 1; i <= arr.length-1; i++ ) {
			item = arr[i];
			j = i - 1;
			while( j>=0 && arr[j] > item) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = item;
		}
		
//		Display array elements after sorting
		System.out.println();
		System.out.println("Array elements after sorting");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
    
	}
  
}
