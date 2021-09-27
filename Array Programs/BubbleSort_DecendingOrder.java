import java.util.Scanner;

public class BubbleSort_DecendingOrder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int len = scan.nextInt();
		int arr[] = new int[len];
//		Taking array elements from  the user
		System.out.println("Enter the array elements:");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.println("Enter an element:");
			arr[i] = scan.nextInt();
		}
//		Displaying array contents before sorting
		System.out.println("Array contents before sorting:");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
//		Bubble sorting logic
		int help;
		for (int i = 0; i <= arr.length-2; i++) {
			for (int j = 0; j <= arr.length-2-i; j++) {
//				Condition to sort array elements in descending order
				if(arr[j] < arr[j+1]) {
					help = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = help;
				}
			}
		}
//		Displaying array contents after sorting
		System.out.println("Array contents after sorting:");
		for (int i = 0; i <= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
