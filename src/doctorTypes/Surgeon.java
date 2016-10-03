package doctorTypes;

public class Surgeon extends doctors {
	//Make instance Variables
	boolean MakesHouseCalls;
	boolean WorksAtHospital;
	
	//Make Constructor
	public Surgeon(){
		WorksAtHospital=true;
		MakesHouseCalls=false;
	}
	@Override
	
	protected void treatPatient(){
		System.out.println("Im a surgeon, I can make incisions!");
		

	}
}
