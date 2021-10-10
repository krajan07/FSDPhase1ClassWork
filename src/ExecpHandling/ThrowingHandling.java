package ExecpHandling;

import java.io.IOException;
import java.util.Scanner;

public class ThrowingHandling {
	
	static int checkCal(int num1, int num2) throws IOException {
		 if (num1 == num2) 
		{
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
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Number 1: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter Number 2: ");
		int num2 = scanner.nextInt();
		
		try {
		sum = checkCal(num1, num2);
		}
		catch(ArithmeticException AE) {
			System.out.println(AE.getMessage());
		}
		System.out.println("Reult " + sum);
	}
	
 

}
