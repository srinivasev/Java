package interfaces;

public class TesterInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IInterface objA = new ClassA();
		IInterface objB = new ClassB();
		
		((ClassA)objA).m3();
	}

}
