package cw_dataStructures_16Oct;

public class DoublyLinked_Assignment {

	 class Node{    
	        int data;    
	        Node next;
	        Node previous; 
	        public Node(int data) {    
	            this.data = data;    
	        }    
	    }    
	 
	    public Node head,tail = null;    
	   
	    public void addNode(int data) {      
	        Node newNode = new Node(data);    
	        if(head == null) {    
	            head = newNode;    
	            tail = newNode; 
	            head.previous = null;
	            tail.next = null;
	        }    
	        else {    
	           tail.next = newNode;
	        	newNode.previous = tail;    
	            tail = newNode;
	            tail.next = null; 
	        }    
	    }    
	        
	     
	    public void display() {    
	        Node current = head;    
	       if(head == null) {    
	            System.out.println("List is empty");    
	            return;    
	        }    
	        System.out.println("Nodes of doubly linked list: ");    
	        while(current != null) {      
	            System.out.print(current.data + " ");    
	            current = current.next;             
	        }    
	        System.out.println();    
	    }
	
	public static void main(String[] args) {
		DoublyLinked_Assignment DLL = new DoublyLinked_Assignment();    
        DLL.addNode(15);    
        DLL.addNode(25);    
        DLL.addNode(35);    
        DLL.addNode(45);      
        DLL.display();    
	}
}
