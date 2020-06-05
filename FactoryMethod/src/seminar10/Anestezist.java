package seminar10;

public class Anestezist  extends PersonalMedical{

	public Anestezist(String nume, long marca) {
		super(nume, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void descriere() {
		System.out.println(getNume() + " " + getMarca() + "anestezist");
		
	}

}
