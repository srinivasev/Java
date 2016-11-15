package threads;

public class ThreadClass extends Thread{
	
	public void run(){
		System.out.println("run in threads");
	}
	
	public static void main(String[] args) {
		ThreadClass thread1 = new ThreadClass();
		thread1.start();
	}
}
