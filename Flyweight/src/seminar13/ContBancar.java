package seminar13;

public class ContBancar {
	String nrCont;
	double suma;
	
	public ContBancar(String nrCont, double suma) {
		super();
		this.nrCont = nrCont;
		this.suma = suma;
	}
	@Override
	public String toString() {
		return "ContBancar [nrCont=" + nrCont + ", suma=" + suma + "]";
	}
	
	
}
