package seminar10;

public class Main {

	public static void main(String[] args) {
		Pacient pacient = new Pacient("Ion", false, true, false, false);
		System.out.println(pacient.toString());
		
		
		Pacient pacient2 = new PacientBuilderConcret().setNume("Ion").setMicDejunInclus(true).build();
		System.out.println(pacient2.toString());
	}

}
