package MThreads;

public class ThreadPriorityCheck extends Thread{
	public void run() {
		for(int i=1;i<6;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException IE) {
				System.out.println(IE);
			}
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}

	public static void main(String[] args) {
		ThreadPriorityCheck t1=new ThreadPriorityCheck();
		t1.setName("Java");
		t1.setPriority(MAX_PRIORITY);
		
		ThreadPriorityCheck t2=new ThreadPriorityCheck();
		t2.setName("WebEX");
		
		ThreadPriorityCheck t3=new ThreadPriorityCheck();
		t3.setName("Oracle");
		
		ThreadPriorityCheck t4=new ThreadPriorityCheck();
		t4.setName("Python");
		
		ThreadPriorityCheck t5=new ThreadPriorityCheck();
		t5.setName("Chrome");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t3.getState());
		System.out.println(t4.getState());
		System.out.println(t5.getState());

	}

}
