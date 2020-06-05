package chainOfResponsability;

public class Pacient implements IObserver{

	private String nume;
	private String nrTelefon;
	private String email;
	
	
	public Pacient(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	public String getNume() {
		return nume;
	}

	public String getNrTelefon() {
		return nrTelefon;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println(this.nume + " ai primit mesajul: " + mesaj);
	}
	

}
