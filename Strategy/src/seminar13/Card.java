package seminar13;

public class Card implements IPlata{

	@Override
	public void plateste(int suma) {
		System.out.println("S a platit cu cardul suma de " + suma);
		
	}

}
