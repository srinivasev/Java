package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;



public class CallableThreadRun implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000000000);
		//int i=5/0;
		return Thread.currentThread().getName();
	}

	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		Future<String> result = (Future) executor.submit(new CallableThreadRun());
		try {
			System.out.println(System.currentTimeMillis());
//			System.out.println(result.get());
			System.out.println(result.get(100, TimeUnit.SECONDS));
			System.out.println(System.currentTimeMillis());
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
