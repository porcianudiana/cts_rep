package clase;

public class Autobuz implements AutobuzLinie{
	
	private String modelString;
	private Integer anfabricareInteger;
	private Integer nrlocurInteger;
	
	

	@Override
	public void descrieAutobuz(Linie linie) {
	System.out.println("linie: "+linie.toString()+"autobuz: "+this.toString());
		
	}



	public Autobuz(String modelString, Integer anfabricareInteger, Integer nrlocurInteger) {
		super();
		this.modelString = modelString;
		this.anfabricareInteger = anfabricareInteger;
		this.nrlocurInteger = nrlocurInteger;
	}



	@Override
	public String toString() {
		return "Autobuz [modelString=" + modelString + ", anfabricareInteger=" + anfabricareInteger
				+ ", nrlocurInteger=" + nrlocurInteger + "]";
	}
	
	
	

}
