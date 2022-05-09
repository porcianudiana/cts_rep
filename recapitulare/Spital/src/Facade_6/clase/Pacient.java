package Facade_6.clase;

import java.util.ArrayList;
import java.util.List;

public class Pacient {
	private List<Boolean> starePacietiBooleans;
	
	

	public Pacient(List<Boolean> starePacietiBooleans) {
		starePacietiBooleans=new ArrayList<Boolean>();
		
		for(int i=0;i<5;i++) {
			starePacietiBooleans.add(true);
			
		}
		
		for(int i=0;i<16;i++) {
			starePacietiBooleans.add(false);
			
		}
	}



	public boolean esteSanatos(Integer codPacient) {
		return starePacietiBooleans.get(codPacient);
	}

	@Override
	public String toString() {
		return "Pacient [starePacietiBooleans=" + starePacietiBooleans + "]";
	}
	
	
	

}
