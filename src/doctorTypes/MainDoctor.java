package doctorTypes;
import java.util.Scanner;

public class MainDoctor {

	public static void main(String[] args) {
		System.out.println("Hello welcome, which doctor could I recommend for you?");
		Scanner input = new Scanner(System.in);
		input.nextLine();
		
		doctors d1 = new doctors();
		FamilyDoctor famDoc= new FamilyDoctor();
		d1.treatPatient();
		famDoc.treatPatient();
		
		if(){
		}
		else{
		Surgeon theSurgeon = new Surgeon();
		theSurgeon.treatPatient();
		}
	}
}
