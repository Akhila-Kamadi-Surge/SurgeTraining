package com.Surge.Aug29;

class ThreadingDemo extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			try {
				String threadName = "Thread "+i;
				Thread.currentThread().setName(threadName);
				System.out.println("Thread "+Thread.currentThread().getName() + " in "+Thread.currentThread().getState()+" state");
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println("Value of i : "+i);
		}
	}
}
public class Threading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName());
		Thread.sleep(1000);//1 sec
		//Anonymous thread
		new Runnable() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		ThreadingDemo obj = new ThreadingDemo();
		obj.start();
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName());
		System.out.println("Finished...");
	}

}
