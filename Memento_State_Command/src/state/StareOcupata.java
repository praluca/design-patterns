package state;

public class StareOcupata implements IState{

	@Override
	public void schimbaStare(Masa masa) {
		masa.setStare(this);
		
	}

	@Override
	public void printSatre(int nrMasa) {
		System.out.println("Masa " +nrMasa +" este ocupata ");
		
	}

}
