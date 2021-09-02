package Basiclearning;

import java.util.Scanner;

public class ValidPassword {
	public static void main(String[] args) {
		int num=0,upper=0,chr=0;
	
	Scanner ip = new Scanner (System.in);
	System.out.println("Enter the P@$$w0rD");
	String input = ip.next();
	
	char [] ch= input.toCharArray();
	if (input.length() >=10)
	{
		
		for (int i = 0; i < ch.length; i++) {
			
			if (Character.isDigit(ch[i]))
					{
					num ++;
					}
			
			if(Character.isLetter(ch[i]))
			{
				chr++;
			}
			
			if(Character.isUpperCase(ch[i]))
			{
				upper++;
			}
			
		}
		
		if(input.length() <=10 && num>=2 && chr>=2 && upper >=1 )
		{
			System.out.println("Entered Password is VALID");
		}
		
		else if (num <2 ) {
			
			System.out.println("Please enter the password with atleast 2 numbers");
			
		}
	
		else if (upper <1 ) {
			
			System.out.println("Please enter the password with ATLEAST ONE UPPERCASE");
		}
		else if (chr<2) {
			
			System.out.println("Please enter the password atleast 2 letters");
			
		}
		
	}
	else if  (input.length()< 10) {
			System.out.println("Password should contain more than 10 CHARACTER");
		}
		

		
		

	ip.close();
	
	}

}
