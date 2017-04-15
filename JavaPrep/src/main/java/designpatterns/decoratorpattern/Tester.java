package designpatterns.decoratorpattern;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FormicaPlywood plyWood = new FormicaPlywood(new Plywood());
		
		System.out.println(plyWood.getCompanyName());
		System.out.println(plyWood.getCost());
	}

}
