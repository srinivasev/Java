package exceptions;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a = 0;
			int b = 1;
			int c = b/a;
		}catch(Exception e){
			System.out.println("Catching Unchecked Exceptions");
		}
	}

}
