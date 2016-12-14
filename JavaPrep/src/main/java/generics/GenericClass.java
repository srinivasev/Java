package generics;

public class GenericClass<T> {
	
	private T instanceVar;
	 
	public T getinstancVar(){
		return this.instanceVar;
	}
	
	public void setInstanceVar(T t){
		this.instanceVar = t;
	}
	
	public static void main(String[] args) {
		GenericClass object1 = new GenericClass<>();
		object1.setInstanceVar(40);
		
		GenericClass object2 = new GenericClass<>();
		object2.setInstanceVar("srinivas");
		System.out.println(object2.getinstancVar());
		
		System.out.println(object1.getinstancVar());
	}
}
