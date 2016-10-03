package doctorTypes;

public class FamilyDoctor extends doctors {
	
	//Create instance Variables
	boolean MakesHouseCalls;
	boolean WorksAtHospital;
	
	//Make constructor
	public FamilyDoctor(){
		WorksAtHospital = false;
		MakesHouseCalls = true;
	}	
	
	@Override
	protected void treatPatient(){
		System.out.println("Im a family doctor, I can give you advice?");
		
	}
	
	

}
