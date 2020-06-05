package chainOfResponsability.clase;

import chainOfResponsability.IObserver;

public class NotificatorManager extends Notificator {

	@Override
	public void trimiteNotificare(IObserver observer, String mesaj) {
		System.out.println("Pentru pacientul " + observer.getNume() + " nu avem date de contact.");
		
	}

}
