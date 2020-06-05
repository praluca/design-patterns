package observer;

import java.util.ArrayList;
import java.util.List;

public class Spital implements Subject{

	List<IObserver> observeri = new ArrayList<>();

	@Override
	public void adaugaObserver(IObserver observer) {
		observeri.add(observer);
		
	}

	@Override
	public void stergeObserver(IObserver observer) {
		observeri.remove(observer);
		
	}

	@Override
	public void notificaObserveri(String mesaj) {
		for(IObserver observer : observeri) {
			observer.primesteMesaj(mesaj);
		}
		
	}
	

}
