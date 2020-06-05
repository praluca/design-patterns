package seminar10;

public abstract class PersonalMedical {
	private String nume;
	private long marca;
	public PersonalMedical(String nume, long marca) {
		super();
		this.nume = nume;
		this.marca = marca;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public void setMarca(long marca) {
		this.marca = marca;
	}
	public String getNume() {
		return nume;
	}
	public long getMarca() {
		return marca;
	}
	
	public abstract void descriere();
	
}
