import interfaces.Icecream;
import model.BsaicIceCream;
import model.VanillaIceCream;
import model.MinIceCream;

public class main {

	public static void main(String[] args) {
		
		Icecream basIcecream = new BsaicIceCream();
		System.out.println("Basic Ice-Cream - cost is: $" + basIcecream.cost());
		
		// Add Vanilla to the order
		Icecream vanilla = new VanillaIceCream(basIcecream); // warpping vanilla
		System.out.println("Adding Vanilla - cost is: $" + vanilla.cost());
		
		// Add Mint to the order
		Icecream mint = new MinIceCream(vanilla);
		System.out.println("Adding Mint - cost is: $" + mint.cost());
	}
}

/*
The output:

Creating a basic Ice-Cream!
Basic Ice-Cream - cost is: $0.5
Adding Vanilla Ice-Cream!
Adding Vanilla - cost is: $1.5
Adding Mint Ice-Cream!
Adding Vanilla Ice-Cream!
Adding Mint - cost is: $3.0
*/
