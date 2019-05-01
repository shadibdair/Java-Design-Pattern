import java.util.ArrayList;
import java.util.List;

public class ProxyBanK implements Bank{

	private RealBank bank = new RealBank();
	private static List<String> bannedClinets;
	
	static {
		bannedClinets = new ArrayList<>();
		bannedClinets.add("Xhxaw");
		bannedClinets.add("s@aw");
		bannedClinets.add("#sdqw.com");
	}
	
	@Override
	public void withdrawMoney(String clientName) throws Exception {
		if(bannedClinets.contains(clientName.toLowerCase())) {
			throw new Exception(clientName + " Access Denied! You are not who you say you are!");
		}
		bank.withdrawMoney(clientName);
	}

}
