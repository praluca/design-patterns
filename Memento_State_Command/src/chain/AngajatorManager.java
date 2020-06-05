package chain;

public class AngajatorManager extends Angajator{

	@Override
	public void angajare(Candidat candidat) {
		if(candidat.isCompetenteManageriale() && candidat.isCompetenteProgramare() && candidat.isCompetenteTestare()){
			System.out.println("Candidatul " + candidat.getNume()+ " este angajat pe pozitia de manager");
			} else {
				super.getAngajator().angajare(candidat);
			}
		}
	
}
