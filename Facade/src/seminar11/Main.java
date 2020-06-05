package seminar11;

public class Main {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("2981220180017");
		if(persoana.getVarsta() >18) {
			if(Politie.esteUrmarit(persoana.getCNP())) {
				if(Fisc.areCreante(persoana.getCNP())) {
					System.out.println("Cont creat!");
				}
			}
		}

	}

}
