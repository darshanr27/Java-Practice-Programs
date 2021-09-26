import java.util.Scanner;
public class Assignment8_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array length:");
		int len=scan.nextInt();
		int arr1[] = new int[len];
		int arr2[] = new int[len];
		
		// Taking the input for arr1
		System.out.println("Enter the arr1 elements:");
		for (int i = 0; i <= arr1.length-1; i++) {
			System.out.println("Enter an element");
			arr1[i] = scan.nextInt();
		}
		
		// Taking the input for arr2
		System.out.println("Enter the arr2 elements:");
		for (int i = 0; i <= arr2.length-1; i++) {
			System.out.println("Enter an element");
			arr2[i] = scan.nextInt();
		}
		
		// Creating the result array
		int result[] = new int[len];
		int j=len-1;
		// Adding the arr1 and arr2 elements and storing it in result array in reverse order
		for (int i = 0; i <= arr1.length-1; i++) {
			result[j] = arr1[i]+arr2[i];
			j--;
		}
		
		// Displaying the contents of the result array
		System.out.println();
		System.out.println("Result array contents are");
		for (int i = 0; i <= result.length-1; i++) {
			System.out.print(result[i] + " ");
		}
	}
}