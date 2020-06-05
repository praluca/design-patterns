package memento;

public class Main {

	public static void main(String[] args) {
		Spital spital = new Spital("Spital1", 20, 30);
		ManagerBackup backup = new ManagerBackup();
		backup.addBackup(spital.salveazaMemento());
		spital.setNrPacienti(40);
		System.out.println(spital.toString());
		
		spital.setNrMedici(26);
		System.out.println(spital.toString());
		
		backup.addBackup(spital.salveazaMemento());
		
		spital.restaureazaFromMemento(backup.getMemento(0));
		System.out.println(spital.toString());
		
	}

}
