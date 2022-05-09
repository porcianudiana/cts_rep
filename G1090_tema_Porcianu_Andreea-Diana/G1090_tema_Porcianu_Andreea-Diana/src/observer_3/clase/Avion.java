package observer_3.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Avion {

	
	protected List<InterfataCalator> calatoriAnuntati;

	public Avion() {
		this.calatoriAnuntati=new ArrayList<>();
	}
	
	public void activareAnunt(InterfataCalator calator) {
		calatoriAnuntati.add(calator);	
		}
	
	public void dezactivareAnunt(InterfataCalator calator) {
		calatoriAnuntati.remove(calator);
	}
	
	public abstract void anuntaCalatori();
	
	
	
}
