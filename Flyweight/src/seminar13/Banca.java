package seminar13;

import java.util.HashMap;
import java.util.Map;

public class Banca {
	private static Map<String, IClientBanca> clienti = new HashMap<String, IClientBanca>();
	public static IClientBanca  getClient(String nume, String cnp, String adresa, String nrTelefon) {
		IClientBanca client = clienti.get(cnp);
		if(client == null) {
			client = new Client(nume, cnp, adresa, nrTelefon);
			clienti.put(cnp, client);
		}
		return client;

	}
	public static int dimensiuneMap() {
		return clienti.size();
	}
}
