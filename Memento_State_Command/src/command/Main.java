package command;

public class Main {

	public static void main(String[] args) {
		Medic medic = new Medic("Popescu", "cardiolog");
		Operator operator = new Operator();
		
		operator.invok(new ComandaInternare(medic, "Vasilescu"));
		operator.invok(new ComandaTratare(medic, "Gheorghe"));
		operator.executaComanda();
		operator.invok(new ComandaInternare(medic, "Iordache"));
		operator.executaComenzi();
	}

}
