package cw_ExecpHandling_Oct9;

public class nestedTry {
	static int a[]= new int[5];
	public static void main(String[] args) {
		try {
			checkExcpetion();
			a[5]=9;
			
		} catch (ArrayIndexOutOfBoundsException AIOB) {
			System.out.println("Inside the outer catch block");
		}
		finally {
			System.out.println("Inside the outer finally block");
		}
	}
	private static void checkExcpetion() {
		
		try {
			a[3]= 30/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Inside the inner catch block");
		}
		finally {
			System.out.println("Inside the inner finally block");
		}
	}

}
