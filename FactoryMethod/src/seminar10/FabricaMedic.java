package seminar10;

public class FabricaMedic implements FabricaPersonalMedical {

	@Override
	public PersonalMedical createType(String nume, long marca) {
		
		return new Medic(nume, marca);
	}

}
