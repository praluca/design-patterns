package template;

public class Spital extends TemplateInternare{

	@Override
	public void analizaStarePacient() {
		System.out.println("S-a analizat starea pacientului.");
		
	}

	@Override
	public void verificareDisponibilitatePaturi() {
		System.out.println("S-a verificat disponibilitatea paturilor.");
		
	}

	@Override
	public void emitereFisa() {
		System.out.println("A fost emisa fisa de internare.");
		
	}

}
