
public class main {

	public static void main(String[] args) {
		Bank bank = new ProxyBanK();
		
		try {
			bank.withdrawMoney("paulo");
			bank.withdrawMoney("s@aw");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

// output:

//paulo is withdrawing from the ATM.....
//s@aw Access Denied! You are not who you say you are!
