package seminar10;

public class FabricaAnestezist implements FabricaPersonalMedical {

	@Override
	public PersonalMedical createType(String nume, long marca) {
		// TODO Auto-generated method stub
		return new Anestezist(nume, marca);
	}

}
