package core;

public class PassbyReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassbyReference p = new PassbyReference();
		int value2 = 7;
		p.show(value2);
		Person person = new Person("bob");
		System.out.println("1 person is"+person);
		p.showPerson(person);
		System.out.println("4 person is"+person);
		
	}
	
	public void show(int value){
		System.out.println(value);
	}
	
	public void showPerson(Person person){
		System.out.println("2 person is"+person);
		
		person.setName("jog");
		
		person = new Person("dog");
		
		System.out.println("3 person is"+person);	
	}
}
