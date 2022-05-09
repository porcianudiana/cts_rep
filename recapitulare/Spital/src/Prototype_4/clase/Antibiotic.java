package Prototype_4.clase;

public class Antibiotic implements Reteta{

	
	private String denumireString;

	public Antibiotic(String denumireString) {
		super();
		this.denumireString = denumireString;
	}

	@Override
	public String toString() {
		return "Reteta [denumireString=" + denumireString + "]";
	}

	@Override
	public Reteta copiaza() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Reteta)super.clone();
	}
	
}
