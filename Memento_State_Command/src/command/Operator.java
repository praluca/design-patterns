package command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	
	private List<IComanda> comenzi;

	public Operator() {
		super();
		this.comenzi = new ArrayList<IComanda>();
	}
	
	public void invok(IComanda comanda) {
		if(comanda != null) {
			comenzi.add(comanda);
		}
	
	}
	
	public void executaComanda() {
		if(comenzi.size() > 0) {
			comenzi.get(0).executa();
			comenzi.remove(0);
		}
	}
	
	public void executaComenzi() {
		for(IComanda icomanda : comenzi) {
			icomanda.executa();
		}
		comenzi.removeAll(comenzi);
	}
	
	
}
