package seminar10;

public class Main {

	public static void main(String[] args) {
		FabricaPersonalMedical fabrica = new FabricaPersonalMedical();
		PersonalMedical medic =fabrica.createPersonal(TipPersonal.Medic, "Rafila", (long) 2020);
		PersonalMedical asistent =fabrica.createPersonal(TipPersonal.Asistent, "Ion", (long) 2022);
		medic.descriere();
		asistent.descriere();

	}

}
