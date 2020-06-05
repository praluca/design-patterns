package chain;

public class Main {

	public static void main(String[] args) {
		Angajator angajatorManager = new AngajatorManager();
		Angajator anagajaProgramare = new AngajatorProgramator();
		Angajator angajatorTester = new AngajatorTester();
		Angajator raspunsNegativ = new RaspunsNegativ();
		
		angajatorManager.setAngajator(anagajaProgramare);
		angajatorManager.setAngajator(angajatorTester);
		angajatorTester.setAngajator(raspunsNegativ);
		
		Candidat candidat1 = new Candidat("Sasuke", true, true, true);
		Candidat candidat2 = new Candidat("Itachi", false, false, false);
		Candidat candidat3 = new Candidat("Naruto", false, true, true);
		Candidat candidat4 = new Candidat("Ryuk", false, false,true);
		
		angajatorManager.angajare(candidat1);
		angajatorManager.angajare(candidat2);
		angajatorManager.angajare(candidat3);
		angajatorManager.angajare(candidat4);
		


	}

}
