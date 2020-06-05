package memento;

import java.util.ArrayList;
import java.util.List;

public class ManagerBackup {
	
	List<Memento> listaBackup;

	public ManagerBackup() {
		this.listaBackup = new ArrayList<Memento>();
	}
	
	public void addBackup(Memento memento) {
		listaBackup.add(memento);
	}
	
	public Memento getMemento(int position) {
		if(position < listaBackup.size() && position >= 0) {
			return listaBackup.get(position);
		} else {
			return null;
		}
		
	}
	
}
