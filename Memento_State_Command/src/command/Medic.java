package command;

public class Medic {
	private String nume;
	private String specializare;
	public Medic(String nume, String specializare) {
		super();
		this.nume = nume;
		this.specializare = specializare;
	}
	
	public void internare(String numePacient) {
		System.out.println("Medicul cu numele " + nume + " a efectuat o internare pt. pacientul " + numePacient);
	}
	public void tratareImediata(String numePacient) {
		System.out.println("Medicul cu numele " + nume + " a tratat pacientul " + numePacient);

	}
}
