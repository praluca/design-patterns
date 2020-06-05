package seminar13;

public class Cash implements IPlata{

	@Override
	public void plateste(int suma) {
		System.out.println("S a platit cash suma de " + suma);
		
	}

	
}
