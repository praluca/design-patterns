package template;

public abstract class TemplateRetragereCard {
	
	protected String nrCard;
	protected double sumaSpecificata;

	public TemplateRetragereCard(String nrCard) {
		super();
		this.nrCard = nrCard;
	}
	
	public abstract void introducereCard();
	public abstract void introducerePIN(String PIN);
	public abstract void introducereSuma(double suma);
	public abstract double retragereSuma();
	public abstract void retragereCard();
	public final double retragereBani(String PIN, double suma) {
		double sumaRetrasa;
		introducereCard();
		introducerePIN(PIN);
		introducereSuma(suma);
		sumaRetrasa = retragereSuma();
		retragereCard();
		
		return sumaRetrasa;
	}
}
