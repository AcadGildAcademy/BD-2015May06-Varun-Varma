package ThreadsAcad;

class FirstThread extends Thread 
{ 
	
	public void run() 
	{ 		
		for (int i=1; i<=10; i++) 
		{ 	
			System.out.println( "Printing the count: " +i); 			
			try
			{ 
				Thread.sleep(1000); 
				System.out.println("Small Thread is alive? : "+this.isAlive());
				
			} 
			catch (InterruptedException  interruptedException) 
			{ 				
				System.out.println(  "First Thread is interrupted when it is  sleeping" +interruptedException); 
			} 
		} 
	} 
} 
public class IsAliveMainThread {
	public static void main(String args[])    
	{         

		//Creating an object of the first thread        
		FirstThread   firstThread = new FirstThread();       
		   
		firstThread.start();         
		if(firstThread.isAlive())
			System.out.println("i am alive");
	} 
}
