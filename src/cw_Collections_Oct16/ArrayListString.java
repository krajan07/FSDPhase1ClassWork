package cw_Collections_Oct16;

import java.util.*;
public class ArrayListString {

	public static void main(String[] args) {
	
		ArrayList<String> ALS = new ArrayList<String>();
		
		System.out.println("Initial Size of the Array ALS is " + ALS.size());
		
		ALS.add("Hai");
		ALS.add("Hello");
		ALS.add("Hai");
		System.out.println("Content of ALS is " + ALS);
		System.out.println("Size of ALS is " + ALS.size());
		
		//Add new data
		ALS.add("How are you?");
		System.out.println("Content of ALS is " + ALS);
		System.out.println("Size of ALS is " + ALS.size());
		
		//Get the data with position
		System.out.println("Content of ALS at 1st is  " + ALS.get(0));
		System.out.println("Content of ALS at last position is " + ALS.get(ALS.size()-1));
		
		//Reversing the array list
		Collections.reverse(ALS);
		System.out.println("Reversed Array List is " + ALS);
		Collections.reverse(ALS);
		System.out.println("Reversed Array List is " + ALS);
		System.out.println("Content of ALS is " + ALS);
		
		ALS.set(2, "Welcome"); //Set data in the index specified
		ALS.add("Bye");
		ALS.add("Hai");
		ALS.add("To be removed by index"); //Set data in the content specified
		ALS.add("To be removed by content"); //Set data in the content specified
		System.out.println("Content of ALS is " + ALS);
		System.out.println("Size of ALS is " + ALS.size());
		ALS.remove(ALS.size()-2);
		ALS.remove("Hai");
		ALS.remove("To be removed by content");
		System.out.println("Content of ALS is " + ALS);
		System.out.println("Size of ALS is " + ALS.size());
		ALS.clear();
		System.out.println("Content of ALS is " + ALS);
		System.out.println("Size of ALS is " + ALS.size());
	}

}
