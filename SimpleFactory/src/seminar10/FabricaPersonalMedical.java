package seminar10;

public class FabricaPersonalMedical {
	public PersonalMedical createPersonal(TipPersonal tip, String nume, long marca) {
		switch(tip) {
		case Medic: 
			return new Medic(nume, marca);
		case Asistent: 
			return new Asistent(nume, marca);
		case Brancardier: 
			return new Brancardier(nume, marca);
		default: 
			return null;
		}
	}
}
