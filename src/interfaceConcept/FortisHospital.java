package interfaceConcept;

public class FortisHospital implements USMedical, UKMedical, IndMedical {
	//US
	@Override
	public void physioServices() {
 		System.out.println("FH--physioServices");
	}

	@Override
	public void oncologyServices() {
 		System.out.println("FH--oncologyServices");

	}

	@Override
	public void pediaServices() {
 		System.out.println("FH--pediaServices");

	}
	//UK
	@Override
	public void cardioServices() {
 		System.out.println("FH--cardioServices");

	}

	@Override
	public void dentalServices() {
 		System.out.println("FH--dentalServices");

	}
	//India
	 @Override
	public void gynoServices() {
 		System.out.println("FH--gynoServices");

	}

	//@Override
	public void radiologyServices() {
 		System.out.println("FH--radiologyServices");

	}

	//FH -- individual methods
	public void OPTServices() {
 		System.out.println("FH--OPTServices");
	
	}
	
	public void pathologyServices() {}
	
	
}
