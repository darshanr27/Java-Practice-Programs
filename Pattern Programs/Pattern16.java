/*

Pattern 16

A B C D 
E F G H 
I J K L
M N O P
 
*/

public class Pattern16 {

	public static void main(String[] args) {
		int alpha = 65;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print((char)alpha + " ");
				alpha++;
			}
			System.out.println();
		}
		
	}

}
