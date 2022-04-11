package seminar6.clase;

public class Autobuz implements AutobuzLinie{
	
	private String model;
	private Integer anFabricare;
	private Integer nrLocuri;
	@Override
	public void descrieAutobuz(Linie linie) {
		System.out.println("Linie: "+linie.toString()+" Autobuz: "+this.toString());
	}
	
	
	public Autobuz(String model, Integer anFabricare, Integer nrLocuri) {
		super();
		this.model = model;
		this.anFabricare = anFabricare;
		this.nrLocuri = nrLocuri;
	}


	@Override
	public String toString() {
		return "Autobuz [model=" + model + ", anFabricare=" + anFabricare + ", nrLocuri=" + nrLocuri + "]";
	}
	
	
	

}
