package Basiclearning;

import java.util.Scanner;

public class TwodimensionalArray {

	public static void main(String[] args) {

Scanner input = new Scanner (System.in);
System.out.println("Enter the row count in array");
int row = input.nextInt();
System.out.println("Enter the Column count in array");
int column = input.nextInt();

int intArr1[][]= new int[row][column];
		
		for (int i = 0; i <row; i++) {
			
		for (int j = 0; j < column; j++) {
			
			System.out.println("Values are in cell  :(" +i+"," +j+")");
			intArr1 [i][j]=input.nextInt();			
		}
		}
input.close();

for (int i = 0; i <row; i++) {
	
	for (int j = 0; j < column; j++) {
		
		System.out.println(intArr1 [i][j]+"\t");
					
	}
	System.out.println();	
	}


	}

}
