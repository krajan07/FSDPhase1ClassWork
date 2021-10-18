package cw_Collections_Oct16;

import java.util.TreeSet;

public class TreeSet_Assignment {

	public static void main(String[] args) {
		//Create new object
				TreeSet<String> program = new TreeSet<String>();
				//Add data to the Tree Set
				program.add(".Net");
				program.add("Java");
				program.add("C");
				program.add("C++");
				program.add("Python");
				program.add("R");
				System.out.println();
				//Perform operations on the TreeSet String
				System.out.println("Is the Tree set 'Program' empty ? " + program.isEmpty());
				System.out.println("Tree set 'Program' Size is " + program.size());
				System.out.println("Tree set 'Program' content is " + program);
				System.out.println();
				program.remove("R");
				program.remove("C");
				System.out.println("Tree set 'Program' content is " + program);
				System.out.println("Tree set 'Program' Size is " + program.size());
				
				program.add("GoLang");
				program.add("Grehkin");
				program.add("AS400");
				System.out.println();
				System.out.println("Tree set 'Program' content is " + program);
				System.out.println("Does the Tree set 'Program' contain the element 'Java' ? " + program.contains("Java"));
				program.clear();//Empty or remove all the content from the Tree Set
				System.out.println("Tree set 'Program' Size is " + program.size());
				System.out.println("Is the Tree set 'Program' empty ? " + program.isEmpty());

	}

}
