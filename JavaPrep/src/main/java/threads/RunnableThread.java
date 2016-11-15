package threads;

public class RunnableThread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableThread  tObj = new RunnableThread();
		Thread thread1 = new Thread(tObj);
		thread1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run in threads");
	}

}
