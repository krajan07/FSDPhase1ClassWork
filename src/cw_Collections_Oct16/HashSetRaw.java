package cw_Collections_Oct16;

import java.util.LinkedHashSet;

public class HashSetRaw {

	public static void main(String[] args) 
	{	
		//Create new object as RAW. Not recommended for real time use
		LinkedHashSet lhsString = new LinkedHashSet();
		//Add data to the Linked HashSet
		lhsString.add("d");
		lhsString.add("c");
		lhsString.add("true");
		lhsString.add(true);
		lhsString.add(45);
		lhsString.add("b");
		lhsString.add("a");
		lhsString.add('c');
		lhsString.add("c");
		lhsString.add("i");
		lhsString.add(56l);
		lhsString.add(45.7f);
		lhsString.add(46.7343d);
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
