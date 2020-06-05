package memento;

public interface ISpital {
	public Memento salveazaMemento();
	public void restaureazaFromMemento(Memento memento);
}
