package seminar10;

public class Medic extends PersonalMedical {

	public Medic(String nume, long marca) {
		super(nume, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void descriere() {
		System.out.println(getNume() + " " + getMarca() + " medic");
		
	} 

}
