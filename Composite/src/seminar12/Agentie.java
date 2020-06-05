package seminar12;

import java.util.ArrayList;
import java.util.List;

public class Agentie extends Sucursala {

	private List<Sucursala> listaSucursale ;
	
	public Agentie(String numeManager) {
		super(numeManager);
		listaSucursale = new ArrayList<Sucursala>();
	}

	@Override
	public void adaugaSucursala(Sucursala sucursala) {
		listaSucursale.add(sucursala);
		
	}

	@Override
	public void stergeSucursala(Sucursala sucursala) {
		listaSucursale.remove(sucursala);		
	}

	@Override
	public Sucursala getSucursala(int pozitie) {
		
		return listaSucursale.get(pozitie);
	}

	@Override
	public void descriereSucursala() {
		System.out.println("Manager agentie " + getNumeManager()+" si are in subordine urmatoarele "+listaSucursale.size());
		for(int i = 0; i < listaSucursale.size(); i++) {
			System.out.print("   ");
			listaSucursale.get(i).descriereSucursala();
		}
		
	}

}
