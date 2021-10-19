package cw_dataStructures_16Oct;
import java.util.*;
public class genericStack_Assignment {

	public static void main(String[] args) {
		
		Stack S1 = new Stack();
		
		S1.push("Name");
		S1.push("Age");
		S1.push("Gender");
		S1.push("City");
		S1.push("Country");
		S1.push(20);
		S1.push(15);
		S1.push(25);
		S1.push(5.5f);
		S1.push(9.8f);
		
		System.out.println("Elements in the stack are as below : \n");
		for(int i=0; i<S1.size(); i++)
		{
			System.out.println("Index : " +i+ " & Element : " +S1.get(i));
		}
		
		S1.pop();
		S1.pop();
		
		System.out.println("\nElements in the stack after 2 element removal are as below : \n");
		for(int i=0; i<S1.size(); i++)
		{
			System.out.println("Index : " +i+ " & Element : " +S1.get(i));
		}
		
	}

}
