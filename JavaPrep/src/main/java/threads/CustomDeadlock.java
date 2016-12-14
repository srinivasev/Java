package threads;

public class CustomDeadlock {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thread1.start();
		thread2.start();
	}
	
	public static Thread thread1 = new Thread("Thread 1"){
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (Lock1) {
				System.out.println("Obtaining lock 1 "+thread1.getName());
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("Trying to get lock 2 "+thread1.getName());
				synchronized (Lock2) {
					System.out.println("Obtaining lock 1 lock 2 "+thread1.getName());
				}
			}
		}
	};
	
	public static Thread thread2 = new Thread("Thread 2"){
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (Lock2) {
				System.out.println("Obtaining lock 2 "+thread2.getName());
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println("Trying to get lock 1 "+thread2.getName());
				synchronized (Lock1) {
					System.out.println("Obtaining lock 1 lock 2 "+thread1.getName());
				}
			}
		}
	};

}
