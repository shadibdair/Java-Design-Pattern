package model;

import interfaces.Icecream;
import interfaces.IcecreamDecorator;

public class MinIceCream extends IcecreamDecorator{

	public MinIceCream(Icecream icecream) {
		super(icecream);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cost() {
		System.out.println("Adding Mint Ice-Cream!");
		return 1.50 +  super.cost();
	}
	
	

}
