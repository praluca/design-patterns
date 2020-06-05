package chainOfResponsability.clase;

import chainOfResponsability.IObserver;

public class NotificatorTelefon extends Notificator{

	@Override
	public void trimiteNotificare(IObserver observer, String mesaj) {
		if(observer.getNrTelefon()!=null) {
			observer.primesteMesaj("SMS " + mesaj);
		}else {
			super.getUrmatorulNotificator().trimiteNotificare(observer, mesaj);
		}
	}

}
