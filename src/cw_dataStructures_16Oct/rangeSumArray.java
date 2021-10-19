package cw_dataStructures_16Oct;

import java.util.Scanner;

public class rangeSumArray {
	
	int[] elems = {8,90,10,14,30,20,13};

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int start,end;
		
		System.out.println("Enter the start of the range: " );
		start = input.nextInt();
		System.out.println("Enter the end of the range: " );
		end = input.nextInt();
		
		rangeSumArray rsa = new rangeSumArray();
		rsa.sum(start,end);
	}

	private void sum(int start, int end) {
		int result = 0;
		try {
		for(int i=start; i<=end;i++) {
			result = result+ elems[i];
		
		}
		System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Provided range is out of array index");
		}
	}

}
