package state;

public class Main {
	public static void main(String[] args) {
		Masa masa = new Masa(15);
		
		masa.elibereaza();
		masa.rezerva();
		masa.elibereaza();
		masa.ocupa();
		masa.elibereaza();
		
		StareOcupata ocupata = new StareOcupata();
		ocupata.schimbaStare(masa);
		
		StareLibera ocupata2 = new StareLibera();
		ocupata2.schimbaStare(masa);
	}
}
