package seminar10;

public class Asistent extends PersonalMedical {

	public Asistent(String nume, long marca) {
		super(nume, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void descriere() {
		System.out.println(getNume() + " " + getMarca() + " asistent");
		
		
	}

}
