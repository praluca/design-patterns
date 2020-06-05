package seminar10;

public class Pacient {
	private String nume;
	private boolean  patRabatabil;
	private boolean micDejunInclus;
	private boolean papuciDeCamera;
	private boolean halat;
	
	public Pacient(String nume, boolean patRabatabil, boolean micDejunInclus, boolean papuciDeCamera, boolean halat) {
		super();
		this.nume = nume;
		this.patRabatabil = patRabatabil;
		this.micDejunInclus = micDejunInclus;
		this.papuciDeCamera = papuciDeCamera;
		this.halat = halat;
	}
	
	public Pacient() {
		super();
		this.nume = "Anonim";
		this.patRabatabil = false;
		this.micDejunInclus = false;
		this.papuciDeCamera = false;
		this.halat = false;
	}

	@Override
	public String toString() {
		return "Pacient [nume=" + nume + ", patRabatabil=" + patRabatabil + ", micDejunInclus=" + micDejunInclus
				+ ", papuciDeCamera=" + papuciDeCamera + ", halat=" + halat + "]";
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPatRabatabil(boolean patRabatabil) {
		this.patRabatabil = patRabatabil;
	}

	public void setMicDejunInclus(boolean micDejunInclus) {
		this.micDejunInclus = micDejunInclus;
	}

	public void setPapuciDeCamera(boolean papuciDeCamera) {
		this.papuciDeCamera = papuciDeCamera;
	}

	public void setHalat(boolean halat) {
		this.halat = halat;
	}
	
	
	
	

}
