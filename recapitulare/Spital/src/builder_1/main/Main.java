package builder_1.main;

import builder_1.clase.Pacient;
import builder_1.clase.PacientBuilder;

public class Main {

	public static void main(String[] args) {
		Pacient pacient=new PacientBuilder().setPatRabatabil(true).setHasMicDejunInclus(true).setHasPapuciDeCamera(true).setHasHalatInterior(true).build();
		System.out.println(pacient.toString());
		
		
		
		

	}

}
