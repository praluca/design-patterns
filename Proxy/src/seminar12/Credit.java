package seminar12;

public class Credit implements ICredit {
	
	private Client client;
	
	public Credit(Client client) {
		super();
		this.client = client;
	}
	

	@Override
	public void oferaCredit(String moneda) {
		System.out.println("Clientul " + client.getNume() + " a luat credit in " + moneda);
	}


}
