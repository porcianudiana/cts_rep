package prototype.clase;

public class Tramvai implements MijlocTransport{
	private String numevatmanString;
	
	
	

	public Tramvai(String numevatmanString) {
		super();
		this.numevatmanString = numevatmanString;
	}

	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (MijlocTransport) super.clone();
	}

	@Override
	public String toString() {
		return "Tramvai [numevatmanString=" + numevatmanString + "]";
	}
	
	

}
