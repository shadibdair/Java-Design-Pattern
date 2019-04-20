package interfaces;

public class IcecreamDecorator implements Icecream {

	private Icecream icecream;
	
	public IcecreamDecorator(Icecream icecream) {
		this.icecream=icecream;	
	}
	

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.icecream.cost();
	}
	

}
