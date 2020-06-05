package seminar12;

public class Main {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("2981220180017");
		if(Facade.verificaPersoana(persoana) ) {
			System.out.println("Facem cont");
		} else {
			System.out.println("Nu facem");
		}

	}

}
