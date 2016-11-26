package core;

import java.util.HashSet;

class Employee{
	private int eId;
	private String eName;
	
	public Employee(int eId, String eName) {
		super();
		this.eId = eId;
		this.eName = eName;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
}
public class EqualsHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1, "srinivas");
		Employee e2 = new Employee(1, "srinivas");
		Employee e3 = new Employee(1, "srinivas");
		
		HashSet<Employee> h1 = new HashSet();
		h1.add(e1);
		h1.add(e2);
		h1.add(e3);
		
		System.out.println(h1.size());
		

	}

}
