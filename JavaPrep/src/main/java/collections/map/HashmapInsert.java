package collections.map;

import java.util.HashMap;
import java.util.Map;

class Employee{
	public int eId;
	public String eName;
	
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
	
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + "]";
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eId;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eId != other.eId)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		return true;
	}*/
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public int hashCode() {
		int randomNumber = (int)Math.random();
		System.out.println(randomNumber);
		
		int number = 5*eId*(int)Math.random();
		System.out.println(number);
		return number;
	}
	
	
	
}

public class HashmapInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee,String> map = new HashMap<>();
		map.put(new Employee(1,"netcracker"), "bangalore");
		map.put(new Employee(1,"netcracker russia"), "bangalore");
		map.put(new Employee(1,"netcracker spain"), "bangalore");
		
		System.out.println(map.size());
		
		for(Map.Entry<Employee, String> mapEntry:map.entrySet()){
			System.out.println(mapEntry.getKey()+"------"+mapEntry.getValue());
		}
	}

}
