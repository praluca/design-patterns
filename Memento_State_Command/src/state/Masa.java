package state;

public class Masa {
	IState stare;
	private int nrMasa;
	
	

	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new StareLibera();
	}

	public void setStare(IState stare) {
		this.stare = stare;

	}
	
	public void rezerva() {
		if(stare instanceof StareLibera) {
			this.stare = new StateRezervata();
			stare.printSatre(nrMasa);
		} else {
			System.out.println("Masa " + this.nrMasa + "nu poate fi rezervata");
		}
		
	}
	public void ocupa() {
		if(!(stare instanceof StareOcupata)) {
			this.stare = new StareOcupata();
			stare.printSatre(nrMasa);
		}else {
			System.out.println("Nu poate fi ocupata masa " + nrMasa);
		}
		
	}
	public void elibereaza() {
		
		if(!(stare instanceof StareLibera)) {
			this.stare = new StareLibera();
			stare.printSatre(nrMasa);
		}else {
			System.out.println("Este deja libera masa " + nrMasa);
		}
		
	}
}
