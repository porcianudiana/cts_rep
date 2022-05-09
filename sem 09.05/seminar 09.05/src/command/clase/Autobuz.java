package command.clase;

public class Autobuz {

	private String modelString;
	
	
	
	
	public void pleacaInCursa(int linie) {
		
		System.out.println("Autobuzul "+modelString+ " pleaca in cursa pe linia "+linie);
		
		
	}




	public Autobuz(String modelString) {
		super();
		this.modelString = modelString;
	}
	
	
	
}
