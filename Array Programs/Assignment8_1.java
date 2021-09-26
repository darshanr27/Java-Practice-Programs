import java.util.Scanner;

public class Assignment8_1 {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int rows = scan.nextInt();
		System.out.println("Enter the number of columns:");
		int cols = scan.nextInt();
		int arr1[][] = new int[rows][cols];
		System.out.println("Enter the array elements");
		for (int i = 0; i <= arr1.length-1; i++) {
			for (int j = 0; j <= arr1[i].length-1; j++) {
				System.out.println("Enter an array element");
				arr1[i][j] = scan.nextInt();
			}
		}
		
		// Creating another array
		int arr2[][] = new int[rows][cols];
		// Copying arr1 array content to arr2 array
		for (int i = 0; i <= arr1.length-1; i++) {
			for (int j = 0; j <= arr1[i].length-1; j++) {
				arr2[i][j] = arr1[i][j];
			}
		}
		
		// Displaying arr2 array contents
		System.out.println("arr2 Array contents are");
		for (int i = 0; i <= arr2.length-1; i++) {
			for (int j = 0; j <= arr2[i].length-1; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

}