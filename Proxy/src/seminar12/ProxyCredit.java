package seminar12;

public class ProxyCredit implements ICredit {
	
	private Credit credit;

	public ProxyCredit(Credit credit) {
		super();
		this.credit = credit;
	}

	@Override
	public void oferaCredit(String moneda) {
		if(moneda.equalsIgnoreCase("RON")) {
			credit.oferaCredit(moneda);
		} else {
			System.out.println("Creditul nu poate fi realizat, deoarece oferim credite doar in RON");
		}
	}

}
