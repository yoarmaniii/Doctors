package doctorTypes;

public class Surgeon extends doctors {
	boolean worksAtHospital =true;
	@Override
	protected void treatPatient(){
		System.out.println("Im a surgeon, how can I help you?");
	}
}
