package seminar13;

public class Client implements IClientBanca{
	private String nume;
	private String cnp;
	private String nrTelefon;
	private String adresa;
	
	

	public Client(String nume, String cnp,String  adresa, String nrTelefon) {
		super();
		this.nume = nume;
		this.cnp = cnp;
		this.nrTelefon = nrTelefon;
		this.adresa = adresa;
	}



	@Override
	public void printeazaDetaliiClient(ContBancar contBancar) {
		
		String rezultat = this.toString() + contBancar.toString();
		System.out.println(rezultat);
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", cnp=" + cnp + ", nrTelefon=" + nrTelefon + ", adresa=" + adresa + "]";
	}
	
	

}
