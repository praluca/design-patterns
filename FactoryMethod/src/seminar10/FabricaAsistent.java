package seminar10;

public class FabricaAsistent implements FabricaPersonalMedical {

	@Override
	public PersonalMedical createType(String nume, long marca) {
		// TODO Auto-generated method stub
		return new Asistent(nume, marca);
	}

}
