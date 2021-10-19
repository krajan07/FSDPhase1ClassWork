package cw_Collections_Oct16;

import java.util.*;

public class LinkedListAssignment {

	public static void main(String[] args) {
		LinkedList<String> Months = new LinkedList<String>();
		
		Months.add("May");
		Months.add("June");
		Months.add("July");
		Months.add("August");
		Months.add("April");
		Months.add("November");
		System.out.println("\nMonths using add method : \n" + Months);
		Months.addLast("December");
		Months.addFirst("January");
		System.out.println("\nMonths added using addLast & addFirst method : \n" + Months);
		Months.add(1, "March");
		Months.add(1, "Febuary");
		Months.add(8, "September");
		Months.add(9, "October");
		Months.add(3,"");
		Months.set(3, "April");
		Months.remove(8);
		System.out.println("\nMonths in the List are :\n" + Months);
		
        System.out.println("\n****************EVEN MONTHS****************************************");
        for(int i=0;i< Months.size();i++) {
        	if(i%2 != 0) {
        		System.out.println(Months.get(i));
        	}
        }
        
        System.out.println("\n****************ODD MONTHS****************************************");
        for(int i=0;i< Months.size();i++) {
        	if(i%2 == 0) {
        		System.out.println(Months.get(i));
        	}
        }
        
        System.out.println("\n**************** MONTHS IN LIST****************************************");
        ListIterator<String> list_Iter = Months.listIterator();
        while(list_Iter.hasNext()){
           System.out.println(list_Iter.next());
        }
        
        System.out.println("\n<<<<<<<<< Fist and Last Month of the Year >>>>>>>");
        System.out.println(Months.peekFirst()+ "-" +Months.peekLast());
        
        System.out.println("\n<<<<<<<<< Remove My BDay Month 'Sepetember' using Index >>>>>>>");
        Months.remove(8);
        System.out.println(Months);
           
        System.out.println("\n<<<<<<<<< Winter Month Check >>>>>>>");
       
        System.out.println("Is winter month October available in the list? " + Months.contains("October"));
        System.out.println("Is winter month November available in the list? " +Months.contains("November"));
        System.out.println("Is winter month December available in the list? " +Months.contains("December"));
        
	}

}

