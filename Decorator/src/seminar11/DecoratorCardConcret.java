package seminar11;

public class DecoratorCardConcret extends DecoratorCardAbstract {

	public DecoratorCardConcret(CardAbstract cardAbstract) {
		super(cardAbstract);
	}

	@Override
	public void efectuarePlataContactLess() {
		System.out.println("S-a efectuat o plata contactless");
		
	}

}
