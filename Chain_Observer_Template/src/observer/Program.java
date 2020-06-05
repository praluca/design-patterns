package observer;

public class Program {

	public static void main(String[] args) {
		Pacient p1=new Pacient("Gheorghe");
		Pacient p2=new Pacient("Mihai");
		Pacient p3=new Pacient("Andrei");
		
		Spital spital=new Spital();
		spital.adaugaObserver(p1);
		spital.adaugaObserver(p2);
		
		spital.notificaObserveri("A aparut virusul SARS-COV-2");
		
		spital.stergeObserver(p1);
		spital.adaugaObserver(p3);
		
		spital.notificaObserveri("A fost declarata pandemie!");

	}

}
