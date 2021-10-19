package cw_Collections_Oct16;
import java.util.*;
public class cw_Maps_Assignment {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> Fruits = new LinkedHashMap<Integer, String>();
		Fruits.put(1, "Apple");
		Fruits.put(3, "Banana");
		Fruits.put(2, "Chicko");
		Fruits.put(4, "Mango");
		Fruits.put(6, "Water Melon");
		Fruits.put(5, "Musk Melon");
		System.out.println("Fruits in the Map are : \n " + Fruits);
		Fruits.remove(3);
		Fruits.containsValue("Apple");
		
		System.out.println("\n**************** UNSORTED FRUIT LIST IN KEY : VALUE ***********************************");
		for (Integer key : Fruits.keySet()) {
			System.out.println(key + " : " +Fruits.get(key));
		}
		
		System.out.println("\n**************** SORTED FRUIT LIST IN KEY : VALUE ***********************************");
		TreeMap<Integer, String> TM = new TreeMap<Integer, String>(Fruits);
		for (Integer key : TM.keySet()) {
			System.out.println(key + " : " +TM.get(key));
		}
		
		TM.clear();
		Fruits.clear();
		System.out.println("\nIs Fruits Linked HashMap empty?  " + Fruits.isEmpty());
	}

}
