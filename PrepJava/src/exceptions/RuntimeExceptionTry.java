package exceptions;


class Mainclass{

	public void throwsChecked() throws Exception{
		System.out.println("Mainclass throwsChecked");
	}

	public void throwsUnchecked() throws RuntimeException{
		System.out.println("Mainclass throwsUnchecked");
	}
}

class Subclass extends Mainclass{
	
	@Override
	public void throwsChecked() throws RuntimeException{
		System.out.println("Subclass throwsChecked");
	}
	/*public void throwsChecked() throws Exception{
		System.out.println("Subclass throwsChecked");
	}*/

	/*@Override
	public void throwsUnchecked() throws RuntimeException{
		System.out.println("Subclass throwsUnchecked");
	}*/
}
public class RuntimeExceptionTry {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subclass Sc = new Subclass();
		try {
			Sc.throwsChecked();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sc.throwsUnchecked();
	}
}
