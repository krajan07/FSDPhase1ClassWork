package cw_Collections_Oct16;

import java.util.LinkedHashSet;

public class HashSetString {

	public static void main(String[] args) 
	{	
		//Create new object
		LinkedHashSet<String> lhsString = new LinkedHashSet<String>();
		//Add data to the Linked HashSet
		lhsString.add("d");
		lhsString.add("c");
		lhsString.add("true");
		lhsString.add("b");
		lhsString.add("a");
		lhsString.add("ac");
		lhsString.add("c");
		lhsString.add("i");
		//Perform operations on the LinkedHashSet
		System.out.println("Is the LinkedHashSet empty ? " + lhsString.isEmpty());
		System.out.println("LinkedHashSet String Size is " + lhsString.size());
		System.out.println("LinkedHashSet String content is " + lhsString);
		System.out.println("Does the LinkedHashSet String contain the element 'u' ? " + lhsString.contains("u"));
		System.out.println("Does the LinkedHashSet String contain the element 'i' ? " + lhsString.contains("i"));
		System.out.println("Remove element i from LinkedHashSet String --> " + lhsString.remove("i"));
		System.out.println("LinkedHashSet String content is " + lhsString);
		System.out.println("LinkedHashSet String Size is " + lhsString.size());
		System.out.println("LinkedHashSet String HashCode is " + lhsString.hashCode());
		lhsString.clear();//Empty or remove all the content from the Hashset
		System.out.println("Get Class : " + lhsString.getClass());
		System.out.println("LinkedHashSet String Size is " + lhsString.size());
		System.out.println("Is the LinkedHashSet empty ? " + lhsString.isEmpty());
		
	}

}
