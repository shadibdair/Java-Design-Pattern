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
