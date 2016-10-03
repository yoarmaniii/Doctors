package doctorTypes;
import java.util.Scanner;

public class MainDoctor {

	public static void main(String[] args) {
		System.out.println("Hello welcome, which doctor could I recommend for you?");
		Scanner input = new Scanner(System.in);
		input.nextLine();
		doctors theFamilyDoctor = new doctors();
		theFamilyDoctor.treatPatient();
		
		
		doctors theSurgeon = new doctors();
		theSurgeon.treatPatient();
		}
	}

