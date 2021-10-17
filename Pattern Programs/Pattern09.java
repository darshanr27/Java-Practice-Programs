/*

Pattern 9

 *********
  *     *
   *   *
    * *
     *

*/

public class Pattern09 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 11-(2*i); j++) {
				if(i==1 || i==5 || j==1 || j == 11-(2*i))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
