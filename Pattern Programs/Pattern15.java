/*
 
Pattern 15

A 
A B 
A B C 
A B C D 
 
 */

public class Pattern15 {
	public static void main(String[] args) {
		int alpha = 65;
		for(int i = 1; i <= 4; i++) {
//			Resetting the value of alpha
			alpha  = 65;
			for (int j = 1; j <= i; j++) {
				System.out.print((char)alpha + " ");
				alpha++;
			}
			System.out.println();
		}
	}
}
