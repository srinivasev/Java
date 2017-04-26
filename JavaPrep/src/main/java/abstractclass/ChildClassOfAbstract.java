package abstractclass;

public class ChildClassOfAbstract extends AbstractClass{

	public ChildClassOfAbstract(){
		System.out.println("This is child class");
	}
	
	public static void main(String[] args) {
		ChildClassOfAbstract obj = new ChildClassOfAbstract();
		System.out.println(obj.getClass());
		System.out.println(" ----- ");
		AbstractClass obj2 = new AbstractClass() {
		};
		System.out.println(obj2.getClass());
	}
}
