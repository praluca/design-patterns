package seminar11;

public class CreditIpotecar implements ICredit {
	
	private double suma;

	
	public CreditIpotecar(double suma) {
		super();
		this.suma = suma;
	}

	@Override
	public void oferaCredit() {
		System.out.println("A fost oferit un credit cu suma "  + this.suma );
		
	}

	@Override
	public double calculeazaRata(int nrLuni) {
		return suma/nrLuni;	
	}
	
	

}
