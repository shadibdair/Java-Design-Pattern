package model;

import interfaces.Icecream;

public class BsaicIceCream implements Icecream{

	public BsaicIceCream() {
		System.out.println("Creating a basic Ice-Cream!");
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.50;
	}
	

	
}
