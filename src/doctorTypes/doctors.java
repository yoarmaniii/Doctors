package doctorTypes;

public class doctors {
	//Create an instance Variable(s)
	public String newPatient;
	protected boolean WorksAtHospital;
	
	//Make Constructor from instance Variables
	public doctors(){
		WorksAtHospital = true;
	}
	
	
	protected void treatPatient(){
		System.out.println("I can help you, im a doctor!");
		
		
		
	}
}
