package wissen;

import java.util.ArrayList;
import java.util.List;

public class ReadLiveFeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> feed = new ArrayList<String>(){{
			add("A");
			add("B");
			add("C");
			add("D");
			add("E");
		}};
		
		/*while(true){
		 *  	if(null != feed.getData()){
		 *  		create object and invoke start method
		 *  	}
		 *  }
		 */
		while(!feed.isEmpty()){
			WriteToDatabase write = new WriteToDatabase(feed.remove(0));
			Thread t = new Thread(write);
			t.start();
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class WriteToDatabase implements Runnable{
	private String dbEntry;

	WriteToDatabase(String input){
		this.dbEntry = input;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.format("Committed to DB %s thread name %s "+ this.dbEntry,Thread.currentThread().getName());
		System.out.println("Committed to DB thread name "+ this.dbEntry);
		System.out.println("Committed to DB thread name "+ Thread.currentThread().getName());
	}
	
}
