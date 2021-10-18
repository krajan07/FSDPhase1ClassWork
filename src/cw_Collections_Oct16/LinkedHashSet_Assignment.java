package cw_Collections_Oct16;

import java.util.*;

public class LinkedHashSet_Assignment {

	public static void main(String[] args) throws InputMismatchException{
		
		LinkedHashSet L1 = new LinkedHashSet();
		LinkedHashSet<Integer> L2 = new LinkedHashSet<Integer>();
		
		System.out.println("********************************************************************");
		System.out.println("Linked Hash Set L1 content is " + L1);
		System.out.println("Linked Hash Set L1 size " + L1.size());
		L1.add(100);
		L1.add(20);
		L1.add(10.45f);
		L1.add(98.99f);
		L1.add('z');
		L1.add('r');
		L1.add(false);
		System.out.println("Linked Hash Set L1 content is " + L1);
		System.out.println("Linked Hash Set L1 size " + L1.size());
		System.out.println("Linked Hash Set L1 Hashcode " + L1.hashCode());
		L1.clear();
		System.out.println("Linked Hash Set L1 content is " + L1);
		System.out.println("Linked Hash Set L1 size " + L1.size());
		System.out.println("********************************************************************");
		System.out.println();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Integer Numbers : ");
		int n1,n2,n3,n4,n5,n6,n7,n8;
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		n4 = input.nextInt();
		n5 = input.nextInt();
		n6 = input.nextInt();
		n7 = input.nextInt();
		n8 = input.nextInt();
		
		L2.add(n1);
		L2.add(n2);
		L2.add(n3);
		L2.add(n4);
		L2.add(n5);
		L2.add(n6);
		L2.add(n7);
		L2.add(n8);
		
		System.out.println("Linked Hash Set L2 content is " + L2);
		System.out.println("Linked Hash Set L2 size " + L2.size());
		System.out.println("Linked Hash Set L2 Hashcode " + L2.hashCode());
		L2.clear();
		System.out.println("Linked Hash Set L2 content is " + L2);
		System.out.println("Linked Hash Set L2 size " + L2.size());
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

}
