package seminar12;

public class Facade {
	public static boolean verificaPersoana(Persoana persoana) {
		if(persoana.getVarsta() >18) {
			if(!Politie.esteUrmarit(persoana.getCNP())) {
				if(!Fisc.areCreante(persoana.getCNP())) {
					return true;
				} 
			}
		}
		return false;
	}
}
