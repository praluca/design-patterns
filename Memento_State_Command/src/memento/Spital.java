package memento;

public class Spital implements ISpital {
	private String nume;
	private int nrPacienti;
	private int nrMedici;
	
	public Spital(String nume, int nrPacienti, int nrMedici) {
		super();
		this.nume = nume;
		this.nrPacienti = nrPacienti;
		this.nrMedici = nrMedici;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setNrPacienti(int nrPacienti) {
		this.nrPacienti = nrPacienti;
	}
	public void setNrMedici(int nrMedici) {
		this.nrMedici = nrMedici;
	}
	public String getNume() {
		return nume;
	}
	public int getNrPacienti() {
		return nrPacienti;
	}
	public int getNrMedici() {
		return nrMedici;
	}
	@Override
	public Memento salveazaMemento() {
		Memento memento = new Memento(nrPacienti, nrMedici);
		return memento;
	}
	@Override
	public void restaureazaFromMemento(Memento memento) {
		this.nrMedici = memento.getNrMedici();
		this.nrPacienti = memento.getNrPacienti();
		
	}
	@Override
	public String toString() {
		return "Spital [nume=" + nume + ", nrPacienti=" + nrPacienti + ", nrMedici=" + nrMedici + "]";
	}
	
	
}
