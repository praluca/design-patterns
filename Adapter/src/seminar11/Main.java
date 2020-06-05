package seminar11;

import seminar11.framework.CreditLeasing;

public class Main {

	public static void oferaDetaliiCredit(ICredit credit, int nrLuni) {
		credit.oferaCredit();
		System.out.println("Rata este: " + credit.calculeazaRata(nrLuni));
	}
	public static void main(String[] args) {
		CreditIpotecar credit = new CreditIpotecar(250);
		oferaDetaliiCredit(credit, 12);
		
		CreditLeasing creditLeasing = new CreditLeasing(10000, 24);
		
		Adapter adapterObiect = new Adapter(creditLeasing);
		oferaDetaliiCredit(adapterObiect, 24);
		
		AdapterClase adapterClase = new AdapterClase(2400, 12);
		oferaDetaliiCredit(adapterClase, 12);

	}

}
