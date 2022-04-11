package problema7.clase;

public class Decorator extends DecoratorAbstract{

	private String mesajString;

	public Decorator(Imprimanta imprimanta, String mesajString) {
		super(imprimanta);
		this.mesajString = mesajString;
	}

	@Override
	public String toString() {
		return "Decorator [mesajString=" + mesajString + "]";
	}

	@Override
	public void printeazaVerso() {
		System.out.println("Verso "+mesajString);
		
	}
	
	
	
}
