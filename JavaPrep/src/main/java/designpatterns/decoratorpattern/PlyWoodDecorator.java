package designpatterns.decoratorpattern;

public abstract class PlyWoodDecorator implements Iplywood{
	
	protected Plywood tempPlywood;
	
	public PlyWoodDecorator(Plywood plywood){
		this.tempPlywood = plywood;
	}
	public String getCompanyName() {
		// TODO Auto-generated method stub
		return tempPlywood.getCompanyName();
	}
	public int getCost() {
		// TODO Auto-generated method stub
		return tempPlywood.getCost();
	}

}
