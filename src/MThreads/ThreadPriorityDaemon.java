package MThreads;

public class ThreadPriorityDaemon extends Thread{
	public void run() {
		System.out.println("Running Thread Name is : " + Thread.currentThread().getName());
		System.out.println("Running Thread " + Thread.currentThread().getName()+  " Priority is : " + Thread.currentThread().getPriority());
		System.out.println("Running Thread " + Thread.currentThread().getName()+  " State is : " + Thread.currentThread().getState());
		System.out.println("Is the Thread " + Thread.currentThread().getName()+  " Daemon ? " + Thread.currentThread().isDaemon());
		System.out.println("Is the Thread " + Thread.currentThread().getName()+  " Alive ? " + Thread.currentThread().isAlive());
	}

	public static void main(String[] args) {
		ThreadPriorityDaemon m1=new ThreadPriorityDaemon();
		ThreadPriorityDaemon m2=new ThreadPriorityDaemon();
		ThreadPriorityDaemon m3=new ThreadPriorityDaemon();
		
		m1.setName("AAA");
		m2.setName("BBB");
		m3.setName("CCC");
		
		m1.setPriority(MIN_PRIORITY);
		m2.setPriority(MAX_PRIORITY);
		m3.setPriority(NORM_PRIORITY);
		
		m2.setDaemon(true);
		
		m1.start();
		m2.start();
		m3.start();
		
		/*System.out.println(m1.getState()+"\n");
		System.out.println(m2.getState()+"\n");
		System.out.println(m3.getState()+"\n");*/

	}

}
