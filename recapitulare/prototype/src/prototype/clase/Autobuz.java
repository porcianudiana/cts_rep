package prototype.clase;

public class Autobuz implements MijlocTransport{
	
	private String numeSoferString;
	
	

	public Autobuz(String numeSoferString) {
		super();
		this.numeSoferString = numeSoferString;
	}



	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		return (MijlocTransport) super.clone();
	}



	@Override
	public String toString() {
		return "Autobuz [numeSoferString=" + numeSoferString + "]";
	}
	
	

}
