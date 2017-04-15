package designpatterns.decoratorpattern;

public class FormicaPlywood extends PlyWoodDecorator{

	public FormicaPlywood(Plywood plywood) {
		super(plywood);
		// TODO Auto-generated constructor stub
	}
	
	public String getCompanyName() {
		return this.tempPlywood.getCompanyName()+" Formica Company";
	}
	
	public int getCost(){
		return this.tempPlywood.getCost()+25;
	}
}
