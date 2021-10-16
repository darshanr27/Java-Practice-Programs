/*
 
Pattern 13 : Pascal's Triangle

      1 
     1 1 
    1 2 1 
   1 3 3 1 
  1 4 6 4 1 


Formula to calculate the number to be displayed
initial value of count = 1
count = count * (i - j) / (j + 1)

 */

public class Pattern13 {

	public static void main(String[] args) {
		int count = 1;
		for(int i = 0; i < 5; i++) {
			count = 1;
			for(int k = 0; k < 6 - i; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print(count + " ");
//				Formula to calculate the number to be printed
				count = count*(i-j)/(j+1);
			}
			System.out.println();
		}
	
  }

}
