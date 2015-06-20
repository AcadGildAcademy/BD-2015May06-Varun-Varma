package ThreadsAcad;

public class Example {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new RunnableThread(), "thread1");
		Thread thread2 = new Thread(new RunnableThread(), "thread2");
		Thread thread3 = new Thread(new RunnableThread(), "thread3");
		
	
		thread1.start(); thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.start();thread2.setPriority(Thread.NORM_PRIORITY);
		thread3.start();thread3.setPriority(Thread.MAX_PRIORITY);
		
		try {
			//delay for one second
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
		}
		//Display info about the main thread
		System.out.println(Thread.currentThread());
	
	}

}
