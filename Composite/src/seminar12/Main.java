package seminar12;

public class Main {

	public static void main(String[] args) {
		Agentie agentie1 = new Agentie("Ion");
		Filiala filiala1 = new Filiala("Vlad");
		Agentie agentie2 = new Agentie("Marian");
		Filiala filiala2 = new Filiala("Maria");
		
		agentie1.adaugaSucursala(filiala1);
		agentie1.adaugaSucursala(agentie2);
		agentie2.adaugaSucursala(filiala2);
		
		agentie1.descriereSucursala();
		agentie2.stergeSucursala(filiala2);
		agentie1.adaugaSucursala(filiala2);
		
System.out.println("\n\n");
		agentie1.descriereSucursala();
	}

}
