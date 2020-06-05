package command;

public class ComandaInternare implements IComanda {

	private Medic medic;
	private String numePacient;
	
	
	public ComandaInternare(Medic medic, String numePacient) {
		super();
		this.medic = medic;
		this.numePacient = numePacient;
	}


	@Override
	public void executa() {
		medic.internare(numePacient);
	}


}
