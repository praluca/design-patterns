package seminar9;

public class ContSalariu {
	
	private double sumaCont;
	private static ContSalariu instance = null;
	
	private ContSalariu() {
		this.sumaCont = 0;
	}
	
	public double getSumaCont() {
		return sumaCont;
	}

	public static synchronized ContSalariu getInstance() {
		if(instance == null) {
			instance = new ContSalariu();
		}
		return instance;
	}
	
	public void incasareSalariu(double salariu) {
		this.sumaCont+= salariu;
	}

}
