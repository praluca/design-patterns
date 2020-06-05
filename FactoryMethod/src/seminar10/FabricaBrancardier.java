package seminar10;

public class FabricaBrancardier implements FabricaPersonalMedical {

	@Override
	public PersonalMedical createType(String nume, long marca) {
		// TODO Auto-generated method stub
		return new Brancardier(nume, marca);
	}
  
}
