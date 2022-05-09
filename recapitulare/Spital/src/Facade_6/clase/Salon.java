package Facade_6.clase;

import java.util.List;

public class Salon {
	private List<Integer> paturiLibereIntegers;
	
	
	

	public Salon(List<Integer> paturiLibereIntegers) {
		super();
		this.paturiLibereIntegers = paturiLibereIntegers;
	}




	@Override
	public String toString() {
		return "Salon [paturiLibereIntegers=" + paturiLibereIntegers + "]";
	}




	public boolean VerificareCamereOcupate(int codPat) {
		return paturiLibereIntegers.contains(codPat);
	}

}
