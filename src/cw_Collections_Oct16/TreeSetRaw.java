package cw_Collections_Oct16;

import java.util.LinkedHashSet;
import java.util.*;

public class TreeSetRaw {

	public static void main(String[] args) {
		
		//Create new object
		TreeSet tsString = new TreeSet();
		//Add data to the Tree Set
		tsString.add("d");
		tsString.add("c");
		tsString.add("true");
		tsString.add("b");
		tsString.add("A");
		tsString.add("ac");
		tsString.add("C");
		tsString.add("i");
		tsString.add("10");
		tsString.add("5");
		tsString.add("true");
		tsString.add("6");
		tsString.add("8");
		tsString.add("false");
		tsString.add("1");
		tsString.add(0);
		tsString.add(4.5f);
		tsString.add(2.4f);
		tsString.add(8.3434d);
		tsString.add(11.345345d);
		
		//Perform operations on the TreeSet String
		System.out.println("Is the LinkedHashSet empty ? " + tsString.isEmpty());
		System.out.println("LinkedHashSet String Size is " + tsString.size());
		System.out.println("LinkedHashSet String content is " + tsString);
		System.out.println("Does the LinkedHashSet String contain the element 'u' ? " + tsString.contains("u"));
		System.out.println("Does the LinkedHashSet String contain the element 'i' ? " + tsString.contains("i"));
		System.out.println("Remove element i from LinkedHashSet String --> " + tsString.remove("i"));
		System.out.println("LinkedHashSet String content is " + tsString);
		System.out.println("LinkedHashSet String Size is " + tsString.size());
		System.out.println("LinkedHashSet String HashCode is " + tsString.hashCode());
		tsString.clear();//Empty or remove all the content from the Tree Set
		System.out.println("Get Class : " + tsString.getClass());
		System.out.println("LinkedHashSet String Size is " + tsString.size());
		System.out.println("Is the LinkedHashSet empty ? " + tsString.isEmpty());
	}

}
