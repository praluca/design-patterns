package seminar10;

public class PacientBuilderConcret implements PacientBuilder {
	private Pacient pacient;
	
	
	public PacientBuilderConcret() {
		super();
		this.pacient = new Pacient();
		
	}
	
	

	@Override
	public Pacient build() {
		return this.pacient;
	}
	
	public PacientBuilderConcret setNume(String nume) {
		this.pacient.setNume(nume);
		return this;
	}

	public PacientBuilderConcret setPatRabatabil(boolean patRabatabil) {
		this.pacient.setPatRabatabil(patRabatabil);
		return this;
	}

	public PacientBuilderConcret setMicDejunInclus(boolean micDejunInclus) {
		this.pacient.setMicDejunInclus(micDejunInclus);
		return this;
	}

	public PacientBuilderConcret setPapuciDeCamera(boolean papuciDeCamera) {
		this.pacient.setPapuciDeCamera(papuciDeCamera);
		return this;
	}

	public PacientBuilderConcret setHalat(boolean halat) {
		this.pacient.setHalat(halat);
		return this;
	}
	

}
