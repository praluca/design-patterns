package chainOfResponsability;

import java.util.ArrayList;
import java.util.List;

import chainOfResponsability.clase.Notificator;
import chainOfResponsability.clase.NotificatorEmail;
import chainOfResponsability.clase.NotificatorManager;
import chainOfResponsability.clase.NotificatorTelefon;

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
		Notificator notificatorEmail=new NotificatorEmail();
		Notificator notificatorTelefon=new NotificatorTelefon();
		Notificator notificatorManager=new NotificatorManager();
		
		notificatorTelefon.setUrmatorulNotificator(notificatorEmail);
		notificatorEmail.setUrmatorulNotificator(notificatorManager);
		
		for(IObserver observer : observeri) {
			notificatorTelefon.trimiteNotificare(observer, mesaj);
		}
	}

}
