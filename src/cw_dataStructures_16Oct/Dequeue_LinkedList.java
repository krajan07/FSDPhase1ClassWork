
package cw_dataStructures_16Oct;
import java.util.*;

public class Dequeue_LinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> LLDQ = new LinkedList<Integer>();
		
		LLDQ.addFirst(90);
		System.out.println(LLDQ);
		LLDQ.addLast(56);
		System.out.println(LLDQ);
		LLDQ.addLast(33);
		System.out.println(LLDQ);
		LLDQ.addFirst(12);
		System.out.println(LLDQ);
		System.out.println(LLDQ.peekFirst());
		System.out.println(LLDQ.peekLast());
		LLDQ.removeFirst();
		System.out.println(LLDQ);
		System.out.println(LLDQ.peekFirst());
		LLDQ.removeLast();
		System.out.println(LLDQ);
		System.out.println(LLDQ.peekFirst());
		LLDQ.addFirst(44);
		System.out.println(LLDQ);
		LLDQ.addFirst(88);
		System.out.println(LLDQ);
		
	}

}
