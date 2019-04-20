package model;

import interfaces.Icecream;
import interfaces.IcecreamDecorator;

public class VanillaIceCream extends IcecreamDecorator{

	public VanillaIceCream(Icecream icecream) {
		super(icecream);
		
	}

	@Override
	public double cost() {
		System.out.println("Adding Vanilla Ice-Cream!");
		return 1.0 + super.cost();
	}
	
	
	
	

}
