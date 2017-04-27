package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CreateProductOrder implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" in call method -- "+ Thread.currentThread().getName());
		return "srinivas";
		
	}
	
	
	public static void main(String[] args) {
		//ExecutorService service = Executors.newSingleThreadExecutor();
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		try {
			//System.out.println(futureObject.get());
			for(int i=10;i>0;i--){
				Future<String> futureObject = service.submit(new CreateProductOrder());
				System.out.println(futureObject.get());
			}
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
