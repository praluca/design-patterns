package seminar10;

public class Brancardier extends PersonalMedical{

	public Brancardier(String nume, long marca) {
		super(nume, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void descriere() {
		System.out.println(getNume() + " " + getMarca() + " brancardier");
		
	}

}
