package Strings;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StringBuffervsStringBuilder implements Callable{
	
//	public static StringBuffer buffer = new StringBuffer("Srinivas");
	public static StringBuilder buffer = new StringBuilder("Srinivas");
	
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future futureObject = (Future) executor.submit(new StringBuffervsStringBuilder());
		try {
			System.out.println(futureObject.get());
			StringBuffervsStringBuilder threadObject = new StringBuffervsStringBuilder();
			Thread t1 = new Thread(new Runnable(){
				@Override
				public void run() {
					// TODO Auto-generated method stub
					buffer = buffer.append("threading");
					System.out.println(buffer);
				}
			});
			t1.start();
			System.out.println(t1.getName());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Thread name"+Thread.currentThread().getName());
		Thread.currentThread().sleep(100000);
		return buffer;
	}

}
