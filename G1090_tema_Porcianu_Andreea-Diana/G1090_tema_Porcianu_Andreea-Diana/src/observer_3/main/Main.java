package observer_3.main;

import observer_3.clase.Avion;
import observer_3.clase.Calator;
import observer_3.clase.InterfataCalator;
import observer_3.clase.Pilot;

public class Main {

	public static void main(String[] args) {
		
		Avion pilotAvion=new Pilot("Escala in Paris");
		InterfataCalator calator1=new Calator("Paul");
		InterfataCalator calator2=new Calator("George");
		InterfataCalator calator3=new Calator("Marian");
		
		
		pilotAvion.activareAnunt(calator1);
		pilotAvion.activareAnunt(calator2);
		pilotAvion.activareAnunt(calator3);
		pilotAvion.anuntaCalatori();
		
		pilotAvion.dezactivareAnunt(calator3);
		pilotAvion.anuntaCalatori();
		
		
		

	}

}
