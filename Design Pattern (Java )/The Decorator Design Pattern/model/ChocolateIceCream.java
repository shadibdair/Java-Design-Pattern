package model;

import interfaces.Icecream;
import interfaces.IcecreamDecorator;

public class ChocolateIceCream extends IcecreamDecorator{

	public ChocolateIceCream(Icecream icecream) {
		super(icecream);
	}	
	
	@Override
	public double cost() {
		System.out.println("Adding Chocolate-Ice-Cream!");
		return 1.0 + super.cost();
	}
	
}
