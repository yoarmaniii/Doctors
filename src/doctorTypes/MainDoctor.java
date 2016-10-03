package doctorTypes;
import java.util.Scanner;

public class MainDoctor {

	public static void main(String[] args) {
		System.out.println("Hello welcome, which doctor could I recommend for you?");
		System.out.println("Would you like one that makes House Calls or Works at a Hospital?");
		System.out.println("Enter Housecalls or WorksAtHospital");
		Scanner input = new Scanner(System.in);
		input.nextLine();
		
		doctors d1 = new doctors();
		FamilyDoctor famDoc= new FamilyDoctor();
		Surgeon surDoc = new Surgeon();
		d1.treatPatient();
		famDoc.treatPatient();
		
		
		
		if(d1.WorksAtHospital){
			System.out.println(surDoc.WorksAtHospital);
		}
		else{
			System.out.println(famDoc.MakesHouseCalls);
		
		}
	}
}
