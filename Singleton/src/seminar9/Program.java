package seminar9;

public class Program {

	public static void main(String[] args) {
		CasaDeMarcat casa = CasaDeMarcat.getInstance();
		double sumaOspatar1 = 50.0;
		casa.Incasare(sumaOspatar1);
		System.out.println("" + casa.getSuma());
		
		
		CasaDeMarcat casa2 = CasaDeMarcat.getInstance();
		double sumaOspatar2 = 30.0;
		casa2.Incasare(sumaOspatar2);
		System.out.println("" + casa2.getSuma());
		
		ContSalariu cont1 = ContSalariu.getInstance();
		double salariu = 1000.0;
		cont1.incasareSalariu(salariu);
		System.out.println("" + cont1.getSumaCont());
		
		ContSalariu cont2 = ContSalariu.getInstance();
		double salariu2 = 1200.0;
		cont2.incasareSalariu(salariu2);
		System.out.println("" + cont2.getSumaCont());
	}

}
