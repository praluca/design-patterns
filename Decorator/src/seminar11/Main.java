package seminar11;

public class Main {

	public static void main(String[] args) {
		Card card = new Card();
		card.efectuarePlataOnline();
		card.efectuarePlataNormala();
		DecoratorCardConcret cardDecorat = new DecoratorCardConcret(card);
		cardDecorat.efectuarePlataContactLess();
		cardDecorat.efectuarePlataNormala();
	}

}
