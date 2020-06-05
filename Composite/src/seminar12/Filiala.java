package seminar12;


public class Filiala extends Sucursala {

	public Filiala(String numeManager) {
		super(numeManager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void adaugaSucursala(Sucursala sucursala) {
		throw new IllegalArgumentException();
		
	}

	@Override
	public void stergeSucursala(Sucursala sucursala) {
		throw new IllegalArgumentException();
		
	}

	@Override
	public Sucursala getSucursala(int pozitie) {
		throw new IllegalArgumentException();
	}

	@Override
	public void descriereSucursala() {
		System.out.println("Manager filiala " + getNumeManager());
		
	}

	

}
