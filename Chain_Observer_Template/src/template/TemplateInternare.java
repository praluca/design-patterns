package template;

public abstract class TemplateInternare {

	public abstract void analizaStarePacient();
	public abstract void verificareDisponibilitatePaturi();
	public abstract void emitereFisa();
	
	public final void internarePacient() {
		analizaStarePacient();
		verificareDisponibilitatePaturi();
		emitereFisa();
	}
}
