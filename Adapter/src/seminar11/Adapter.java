package seminar11;

import seminar11.framework.CreditLeasing;

public class Adapter implements ICredit {

	private CreditLeasing creditLeasing = null;
	
	
	public Adapter(CreditLeasing creditLeasing) {
		super();
		this.creditLeasing = creditLeasing;
	}

	@Override
	public void oferaCredit() {
		creditLeasing.oferLeasing();
		
	}

	@Override
	public double calculeazaRata(int nrLuni) {
		return creditLeasing.calculareaSumaDePlataLunara();
	}
	
}
