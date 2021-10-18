package cw_MThreads_Oct10;

class Customer{  
	
int amount=10000;  
  
	synchronized void withdraw(int amount){  
		
	System.out.println("Withdraw planned for " + amount);  
	  
		if(this.amount<amount)
		{  
		System.out.println("Available balance is " +this.amount+ ". Waiting for deposit!!");  		
		try{
			wait();
		   }
		catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("Withdraw completed. Balance amount is "+ this.amount);  
	}  
  
	synchronized void deposit(int amount){  
		System.out.println("Amount planned for deposit is " +amount);  
		this.amount+=amount;  
		
		System.out.println("Deposit is completed and current available Balance amount is  " + this.amount);  
		notify(); 
	}  
}  
  
public class BankDepWdWait{  
	public static void main(String args[]){  
		final Customer c=new Customer();  
		
		new Thread(){                 
		  public void run()
		  {
			c.withdraw(5000);
		  }  
		}.start();  
		
		new Thread(){                
			  public void run()
			  {
				c.withdraw(4000);
			  }  
			}.start();  
			
		new Thread(){                
			  public void run()
			  {					
				c.withdraw(10000);
			
			  }  	
			}.start();  
		
		new Thread(){  
		  public void run()
		   {
			 c.deposit(20000);
		   }  
		}.start();    
	}}