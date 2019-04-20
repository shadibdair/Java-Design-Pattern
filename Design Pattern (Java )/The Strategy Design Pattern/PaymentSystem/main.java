import controller.CreditCardAlgorithm;
import controller.PaypalAlgorithm;
import controller.ShoppingCart;
import model.Product;

public class main {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		
		Product pants = new Product("313", 25);
		Product shirt = new Product("872", 15);
		
		
		cart.addProduct(pants);
		cart.addProduct(shirt);

		
		// Payment decisions
		cart.pay(new PaypalAlgorithm("shadi@buildapps.com", "nowayman"));
		cart.pay(new CreditCardAlgorithm("Bob", "892142"));
	}

}

/*
 The output:
 
40 paid with Paypal.
40 paid with Card.

 */

