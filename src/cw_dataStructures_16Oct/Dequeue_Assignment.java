package cw_dataStructures_16Oct;

import java.util.*;

public class Dequeue_Assignment {

	
private List<Integer> DQ = new ArrayList<Integer>();
    
    public void insertFront(int item){
        //add element at the beginning of the queue
        System.out.println("adding at front: "+item);
        DQ.add(0,item);
        System.out.println(DQ);
    }
     
    public void insertRear(int item){
        //add element at the end of the queue
        System.out.println("adding at rear: "+item);
        DQ.add(item);
        System.out.println(DQ);
    }
     
    public void removeFront(){
        if(DQ.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        int rem = DQ.remove(0);
        System.out.println("removed from front: "+rem);
        System.out.println(DQ);
    }
     
    public void removeRear(){
        if(DQ.isEmpty()){
            System.out.println("Deque underflow!! unable to remove.");
            return;
        }
        //remove an item from the beginning of the queue
        int rem = DQ.remove(DQ.size()-1);
        System.out.println("removed from rear: "+rem);
        System.out.println(DQ);
    }
     
    public int peakFront(){
        //gets the element from the front without removing it
        int item = DQ.get(0);
        System.out.println("Element at first: "+item);
        return item;
    }
     
    public int peakRear(){
        //gets the element from the rear without removing it
        int item = DQ.get(DQ.size()-1);
        System.out.println("Element at rear: "+item);
        return item;
    }
	
	public static void main(String[] args) {
		
		Dequeue_Assignment DQA = new Dequeue_Assignment();
	        
		DQA.insertFront(90);
		DQA.insertRear(56);
		DQA.insertRear(33);
		DQA.insertFront(12);
		DQA.peakFront();
		DQA.peakRear();
		DQA.removeFront();
		DQA.peakFront();
		DQA.removeRear();
		DQA.peakFront();
		DQA.insertFront(44);
		DQA.insertFront(88);

	}
	

}
