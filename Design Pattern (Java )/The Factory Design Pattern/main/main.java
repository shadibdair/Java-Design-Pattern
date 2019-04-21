package main;

import interfaces.HamburgerStore;
import model.CheeseBurger;
import model.Hamburger;
import model.JamHamburgerstore;
import model.MozHamburgerStore;

public class main {

	public static void main(String[] args) {
		
		 CheeseBurger cheeseBurger = new CheeseBurger();

		 HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
	     HamburgerStore jamaicanBurgerStore = new JamHamburgerstore();

	     Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
	     System.out.println("Shadi ordered " + hamburger.getName() + "\n" );

	     hamburger = jamaicanBurgerStore.orderHamburger("veggie");
	     System.out.println("James Bond ordered: " + hamburger.getName() + "\n");

	}

}

/*
The Output :
 
Boxing...
Paulo ordered Mozambican Style Cheese Burger

Preparing Jamaican Style Veggie Burger
Adding sauce...Spicy jamaican sauce
Adding buns ...Lettuce wrap!
Cooking Jamaican style....
Boxing...
James Bond ordered: Jamaican Style Veggie Burger


 */
