package seminar10;

public class Main {

	public static void afisarePersonalMedical(FabricaPersonalMedical fabrica, String nume, long marca) {
		PersonalMedical personalMedical = fabrica.createType(nume, marca);
		personalMedical.descriere();
	}
	public static void main(String[] args) {
		
		afisarePersonalMedical(new FabricaAsistent(), "Ion", 120);
		afisarePersonalMedical(new FabricaMedic(), "Alexandru", 200);
		afisarePersonalMedical(new FabricaAnestezist(), "Ion", 120);
	}

}
