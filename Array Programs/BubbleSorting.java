import java.util.Scanner;

class BubbleSorting {
	public static void main(String args[])
	{	
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
//		Printing the array contents before sorting
		System.out.println("Array contents before sorting:");
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
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
		System.out.println();
		System.out.println("Sorted array contents are:");
		for(int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
}
}
