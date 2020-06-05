package seminar13;

public class Client {
	private IPlata metodaPlata;
	public void platesteReteta(int suma) {
		metodaPlata.plateste(suma);
	}
	public void setMetodaPlata(IPlata metodaPlata) {
		this.metodaPlata = metodaPlata;
	}
	
	
}
