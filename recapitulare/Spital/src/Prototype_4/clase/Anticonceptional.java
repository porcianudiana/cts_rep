package Prototype_4.clase;

public class Anticonceptional implements Reteta{
	private String numeString;
	
	

	public Anticonceptional(String numeString) {
		super();
		this.numeString = numeString;
	}



	@Override
	public String toString() {
		return "Anticonceptional [numeString=" + numeString + "]";
	}



	@Override
	public Reteta copiaza() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Reteta)super.clone();
	}
	

}
