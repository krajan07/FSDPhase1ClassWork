package MThreads;

class Calcualtion {
	void add2nums(int n1, int n2) {
		synchronized(this){
			System.out.println("Sum of " +n1+ " and " +n2+ " is " +  (n1+n2));
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	void factoiral(int n1) {
		synchronized(this){
			int i,fact=1;  
			  for(i=1;i<=n1;i++){    
			      fact=fact*i;    
			  } 
			  System.out.println("Factorial of " +n1+ " is " +fact);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread{
	Calcualtion c;
	MyThread1(Calcualtion c){
		this.c=c;
	}
	public void run() {
		c.factoiral(4);
		System.out.println("Inside Thread 1");
	}
  }

class MyThread2 extends Thread{
	Calcualtion c;
	MyThread2(Calcualtion c){
		this.c=c;
	}
	public void run() {
		c.factoiral(6);
		System.out.println("Inside Thread 2");
	}
  }

class MyThread3 extends Thread{
	Calcualtion c;
	MyThread3(Calcualtion c){
		this.c=c;
	}
	public void run() {
		c.add2nums(4, 5);
		System.out.println("Inside Thread 3");
	}
  }

class MyThread4 extends Thread{
	Calcualtion c;
	MyThread4(Calcualtion c){
		this.c=c;
	}
	public void run() {
		c.add2nums(20, 10);
		System.out.println("Inside Thread 4");
	}
  }
public class FactorialAdd {
	public static void main(String[] args) {
		Calcualtion obj = new Calcualtion();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		MyThread3 t3=new MyThread3(obj);
		MyThread4 t4=new MyThread4(obj);
		t2.start(); 
		t3.start();
		t1.start(); 
		t4.start();
	}
}
