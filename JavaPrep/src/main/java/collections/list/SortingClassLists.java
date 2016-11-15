package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
	private int pId;
	private String pName;
	
	public Person(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + "]";
	}
	
}
public class SortingClassLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> pList = new ArrayList();
		pList.add(new Person(3,"NC"));
		pList.add(new Person(2,"Diary"));
		pList.add(new Person(1,"Bangalore"));
		
		for(Person personObj:pList){
			System.out.println(personObj);
		}
		
		Collections.sort(pList,new Comparator<Person>(){

			@Override
			public int compare(Person p1, Person p2) {
				// TODO Auto-generated method stub
				if(p1.getpId()>p2.getpId()){
					return 1;
				}else if(p1.getpId()<p2.getpId()){
					return -1;
				}else{
					return 0;
				}
			}
			
		});
		
		for(Person personObj:pList){
			System.out.println(personObj);
		}
	}

}
