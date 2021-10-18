package cw_ExecpHandling_Oct9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class salaryCheck_CustomException {
	static int salary;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Salary: ");
		salary = scanner.nextInt();
		
		try {
		checkSal(salary);
		}
		catch(Exception E) {
			System.out.println(E.getMessage());
		}
		System.out.println("\n*** We have provided the salary based output provided as above using custom exception ***");
	}

	static void checkSal(int salary2) throws CustomSalException {
		if (salary2 < 2100) {
			throw new CustomSalException("You need to work hard");
		}
		if (salary2 > 2100 && salary2 < 5000) {
			throw new CustomSalException("You salary is somehow good");
		}
		if (salary2 > 5100 && salary2 < 9000) {
			throw new CustomSalException("salary is very good");
		}
		else {
			throw new CustomSalException("salary provided is above 9000");
		}
		}
		
	}
	
	class CustomSalException extends Exception{
		CustomSalException(String message) {
			super(message);
		}
		
}
