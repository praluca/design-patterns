package chainOfResponsability;

public class Program {

	public static void main(String[] args) {
		Pacient p1=new Pacient("Gheorghe", null, "gheorghe@gmail.com");
		Pacient p2=new Pacient("Mihai","0744356789","mihaim@gmail.com");
		Pacient p3=new Pacient("Andrei", null, null);
		
		Spital spital=new Spital();
		spital.adaugaObserver(p1);
		spital.adaugaObserver(p2);
		spital.adaugaObserver(p3);
		
		spital.notificaObserveri("A aparut virusul SARS-COV-2");
	}

}
