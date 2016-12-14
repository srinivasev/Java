package core;

public class MethodOverloading {
	
	public MethodOverloading(){
			
	}
	
	public void display(int a,long b){
		System.out.println("int methods");
	}
	
	public void display(long a,long b){
		System.out.println("long methods");
	}
	
	public void display(double a,double b){
		System.out.println("double methods");
	}
	
	public void display(String a,String b){
		System.out.println("String methods");
	}
	

	public void display(Object a,Object b){
		System.out.println("Object methods");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			MethodOverloading obj = (MethodOverloading)Class.forName("core.MethodOverloading").newInstance();
			obj.display(5,5);
			obj.display("nc", new Integer(5));
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
