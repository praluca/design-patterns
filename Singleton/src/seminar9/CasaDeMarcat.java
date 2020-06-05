package seminar9;

public class CasaDeMarcat {
	private double suma;
	private static CasaDeMarcat instanta = null;
	
	
	private CasaDeMarcat () {
		this.suma= 0;
		
	}
	
	public double getSuma() {
		return suma;
	}

	public static synchronized CasaDeMarcat getInstance() {
		if(instanta == null) {
			instanta = new CasaDeMarcat();
		} 
		return instanta;
		
	}
	public void Incasare(double suma) {
		{
			this.suma+= suma;
		}
	}
}
