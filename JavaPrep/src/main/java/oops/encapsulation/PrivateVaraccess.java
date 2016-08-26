package oops.encapsulation;

class Main {
	
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Main [a=" + a + "]";
	}
	
}

public class PrivateVaraccess extends Main{
	
	public PrivateVaraccess() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		PrivateVaraccess pObj = new PrivateVaraccess();
		//pObj.a = 10;
		pObj.setA(25);
		System.out.println(pObj);
	}
}
