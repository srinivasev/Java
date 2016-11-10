package exceptions;

import java.util.ArrayList;
import java.util.List;

public class CustomRuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			List<Integer> list1 = new ArrayList<Integer>();
			list1.add(1);
			list1.add(2);
			list1.add(3);
			list1.add(4);
			
			for(Integer l1:list1){
				System.out.println("Print list1   "+ l1);
				if(l1==2){
					list1.remove(1);
				}
			}
		}catch(Exception e){
			throw new MyException("catched Runtime exception");
		}
	}

}
class MyException extends RuntimeException{
	
	public MyException(String message){
		System.out.println("Message ********** " + message);
	}
}