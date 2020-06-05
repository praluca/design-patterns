package observer;

public interface Subject {
	public void adaugaObserver(IObserver observer);
	public void stergeObserver(IObserver observer);
	public void notificaObserveri(String mesaj);

}
