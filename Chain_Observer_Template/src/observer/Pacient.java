package observer;

public class Pacient implements IObserver{

	private String nume;
	
	public Pacient(String nume) {
		super();
		this.nume = nume;
	}
	
	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println(this.nume + " ai primit mesajul: " + mesaj);
	}
	

}
