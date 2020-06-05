package seminar13;

public class Main {

	public static void main(String[] args) {
		Client client = new Client();
		client.setMetodaPlata(new Cash());
		client.platesteReteta(100);
		
		client.setMetodaPlata(new Card());
		client.platesteReteta(200);

	}

}
