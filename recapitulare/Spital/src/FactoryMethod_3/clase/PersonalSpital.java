package FactoryMethod_3.clase;

public class PersonalSpital {

	
	private String numePersonalString;
	private int codPersonal;
	public PersonalSpital(String numePersonalString, int codPersonal) {
		super();
		this.numePersonalString = numePersonalString;
		this.codPersonal = codPersonal;
	}
	@Override
	public String toString() {
		return "PersonalSpital [numePersonalString=" + numePersonalString + ", codPersonal=" + codPersonal + "]";
	}
	
	
	
}
