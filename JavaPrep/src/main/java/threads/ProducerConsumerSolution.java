package threads;

import java.util.Vector;

public class ProducerConsumerSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 4;
		Vector sharedQueue = new Vector(size);
		Thread prodThread = (new Thread(new Producer(sharedQueue,size)));
		Thread consumerThread = (new Thread(new Consumer(sharedQueue,size)));
		prodThread.start();
		consumerThread.start();
	}

}

class Producer implements Runnable{
	
	private final Vector sharedQueue;
	private final int size;
	
	public Producer(Vector sharedQueue, int size) {
		super();
		this.sharedQueue = sharedQueue;
		this.size = size;
	}

	public void run(){
		
		for(int i=1;i<=4;i++){
			try{
				System.out.println("Producing ---- " + i);
				produce(i);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	private void produce(int i) throws InterruptedException {
		// TODO Auto-generated method stub
		while(sharedQueue.size() == size){
            synchronized (sharedQueue) {
            	System.out.println("Producer waiting");
            	sharedQueue.wait();
            }
		}
		
		synchronized (sharedQueue) {
			sharedQueue.add(i);
			sharedQueue.notifyAll();
		}
		
	}
}

class Consumer implements Runnable{
	
	private final Vector sharedQueue;
	private final int size;
	
	public Consumer(Vector sharedQueue, int size) {
		super();
		this.sharedQueue = sharedQueue;
		this.size = size;
	}
	
	public void run(){
		while(true){
			System.out.println("Consuming");
			try{
				//System.out.println("Consumed --- "+consume());
				consume();
				Thread.sleep(50);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	private int consume() throws InterruptedException{
		// TODO Auto-generated method stub
		if(sharedQueue.size() == 0){
			synchronized (sharedQueue) {
				sharedQueue.wait();
			}
		}
		synchronized (sharedQueue) {
			System.out.println("Consumed element from sharedQueue   "+sharedQueue.get(0));
			return (Integer)sharedQueue.remove(0);
		}
	}
}
