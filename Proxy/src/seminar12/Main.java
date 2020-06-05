package seminar12;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client("Ion");
		Credit credit = new Credit(client);
		credit.oferaCredit("RON");
		credit.oferaCredit("EUR");
		
		ProxyCredit creditProxy = new ProxyCredit(credit);
		creditProxy.oferaCredit("RON");
		creditProxy.oferaCredit("EUR");
	}

}
