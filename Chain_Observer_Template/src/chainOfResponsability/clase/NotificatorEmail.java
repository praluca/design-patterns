package chainOfResponsability.clase;

import chainOfResponsability.IObserver;

public class NotificatorEmail extends Notificator{

	@Override
	public void trimiteNotificare(IObserver observer, String mesaj) {
		if(observer.getEmail()!=null) {
			observer.primesteMesaj("Email " + mesaj);
		}else {
			super.getUrmatorulNotificator().trimiteNotificare(observer, mesaj);
		}
		
	}

}
