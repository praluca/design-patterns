package seminar13;

public class Main {

	public static void main(String[] args) {
		IClientBanca client = Banca.getClient("Anonim", "29812201880017", "Str. Frumoasa", "0754469733");
		ContBancar cont = new ContBancar("RO123", 5000.0);
		client.printeazaDetaliiClient(cont);

		IClientBanca client2 = Banca.getClient("Anonim2", "29812201880047", "Str. Frumoasa", "0754468733");
		ContBancar cont2 = new ContBancar("RO127", 5000.0);
		client2.printeazaDetaliiClient(cont2);

		System.out.println("" + Banca.dimensiuneMap());
		creareConturi();
		System.out.println("" + Banca.dimensiuneMap());

	}
	
	public static void creareConturi() {
		IClientBanca client = Banca.getClient("Anonim", "29812201880017", "Str. Frumoasa", "0754469733");
		ContBancar cont= new ContBancar("RO234", 3000.0);
		client.printeazaDetaliiClient(cont);
	}

}
