package seminar11;

import seminar11.framework.CreditLeasing;

public class AdapterClase extends CreditLeasing implements ICredit {

	public AdapterClase(double pretProdus, int nrLuni) {
		super(pretProdus, nrLuni);
	}

	@Override
	public void oferaCredit() {
		super.oferLeasing();
		
	}

	@Override
	public double calculeazaRata(int nrLuni) {
		return super.calculareaSumaDePlataLunara();
	}

}
