package abstractclass;

public abstract class AbstractClass {
	
	private final String finalField ;
	private String instanceField;
	
	AbstractClass(){
		finalField = "srinivas"; 
		instanceField = "Netcracker";
		System.out.println("This is constructor of abstract class " + finalField + "  " + instanceField);
	}

}
