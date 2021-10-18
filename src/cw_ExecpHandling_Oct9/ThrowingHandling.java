package cw_ExecpHandling_Oct9;

import java.io.IOException;
import java.util.Scanner;

public class ThrowingHandling {
	
	static int checkCal(int num1, int num2) throws IOException {
		 if (num1 == num2) 
		{
			 System.out.println("Number 1 and 2 are equal, hence will be added. ");
			 return num1+num2;
		}
		else {
			if (num1 > num2) {
				throw new IOException("Number 1 is greater than Number 2");
			}
			else {
				throw new ArithmeticException("Number 2 is greater than Number 1");
			}
		}
	}
		
	public static void main(String[] args) throws IOException 
	{
		int sum=0;
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		int num1 = scan1.nextInt();
		
		System.out.println("Enter Number 2: ");
		int num2 = scan1.nextInt();
		
		try {
		sum = checkCal(num1, num2);
		}
		catch(ArithmeticException AE) {
			System.out.println(AE.getMessage());
		}
		System.out.println("Sum of the 2 numbers are " + sum);
	}
	
 

}
