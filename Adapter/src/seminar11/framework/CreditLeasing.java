package seminar11.framework;

public class CreditLeasing {
	
	private double pretProdus;
	private int nrLuni;
	
	public CreditLeasing(double pretProdus, int nrLuni) {
		super();
		this.pretProdus = pretProdus;
		this.nrLuni = nrLuni;
	}

	public void oferLeasing() {
		System.out.println("A fost oferit un leasing in valoare de " + this.pretProdus);
	}
	
	public void afiseazaSumaPlataLunara() {
		System.out.println("Trebuie platit lunar " + calculareaSumaDePlataLunara());
	}
	
	public double calculareaSumaDePlataLunara() {
		return this.pretProdus/this.nrLuni;
	}
}
