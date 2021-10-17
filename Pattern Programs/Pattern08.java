/*

Pattern 8

     *
    * *
   *   *
  *     *
 *********

*/


public class Pattern08 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 6-i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2*i)-1; j++) {
				if(j==1 || j==(2*i)-1 || i==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
