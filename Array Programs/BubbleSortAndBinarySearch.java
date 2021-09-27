import java.util.Scanner;

public class BubbleSortAndBinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Taking the length of array as input from user
		System.out.println("Enter the size of the array:");
		int len = scan.nextInt();
//		Creating array of the entered length
		int arr[] = new int[len];
//		Taking array contents as input from user
		System.out.println("Enter the array elements:");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println("Enter an element:");
			arr[i] = scan.nextInt();
		}
//		Sorting the array contents in ascending order using bubble sort
		int help;
		for (int i = 0; i <= arr.length-2; i++) {
			for (int j = 0; j <= arr.length-2-i; j++) {
				if(arr[j] > arr[j+1]) {
					help = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = help;
				}
			}
		}
//		Printing the sorted array contents
		System.out.println("Sorrted array contents are:");
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
//		Asking the user to enter key to search and getting the key
		System.out.println();
		System.out.println("Enter the key to search:");
		int key = scan.nextInt();
		
//		Searching the key in the array using binary search and printing the  search result to the user
		int low = 0, high = arr.length - 1;
		int mid;
		while (low <= high) {
			mid = (low+high)/2;
			if (key == arr[mid]) {
				System.out.println("Element found at index " + mid);
				System.exit(0);
			} 
			else if(key > arr[mid]) {
				low = mid + 1;
			}
			else {
				high = mid-1;
			}
		}
		System.out.println("Key not found");
	}
}
