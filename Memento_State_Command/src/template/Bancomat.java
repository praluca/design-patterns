package template;

public class Bancomat extends TemplateRetragereCard {

	public Bancomat(String nrCard) {
		super(nrCard);
	}

	@Override
	public void introducereCard() {
		System.out.println("A fost introdus cardul cu nr " + nrCard);
	}

	@Override
	public void introducerePIN(String PIN) {
		sumaSpecificata = 0;
		System.out.println("A fost introdus PIN ul  " + PIN +" pt cardul cu nr" +  nrCard);
	}

	@Override
	public void introducereSuma(double suma) {
		if(suma > 0) {
			System.out.println("Se doreste retragerea sumei de " + suma);
			sumaSpecificata = suma;
		} else {
			System.out.println("Va rog introduceti suma valida");
			sumaSpecificata =0;
		}
		
		
	}

	@Override
	public double retragereSuma() {
		if(sumaSpecificata != 0 ) {
			System.out.println("A fost retrasa suma " + sumaSpecificata);
			return sumaSpecificata;
		} else {
			return 0;
		}
	
	}

	@Override
	public void retragereCard() {
		System.out.println("A fost retras cardul cu nr " + nrCard);
		
	}

}
