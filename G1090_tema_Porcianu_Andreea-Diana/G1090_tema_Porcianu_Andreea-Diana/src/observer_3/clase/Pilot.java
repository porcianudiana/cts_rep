package observer_3.clase;

public class Pilot extends Avion{
	
	
	private String anuntMesaj;
	
	

	public Pilot(String anuntMesaj) {
		super();
		this.anuntMesaj = anuntMesaj;
	}



	@Override
	public void anuntaCalatori() {
		for(InterfataCalator calator:calatoriAnuntati) {
			calator.primireAnunt(anuntMesaj);
		}
		
	}
	

}
