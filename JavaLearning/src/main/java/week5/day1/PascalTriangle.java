package week5.day1;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner ip =new Scanner(System.in);
		System.out.println("Enter the number of Rows to Print :");
		int input=ip.nextInt();
		System.out.println("Pascal Triangle");
		for (int i = 0; i < input; i++) {
			
			for (int j = 0; j < input -i; j++) {
				
				System.out.print(" ");
				
			}
			int number =1;
			
			for (int k = 0; k <=i; k++) {
				
				System.out.print(number +" ");
				number =number *(i-k)/(k+1);
				
			}
			System.out.println();
			
		}
		ip.close();
	}

}
