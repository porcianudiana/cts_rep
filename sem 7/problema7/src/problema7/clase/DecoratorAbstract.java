package problema7.clase;

public abstract class DecoratorAbstract implements Imprimanta{
	private Imprimanta imprimanta;
	
	
	

	public DecoratorAbstract(Imprimanta imprimanta) {
		super();
		this.imprimanta = imprimanta;
	}

	@Override
	public void printeazaBilet() {
		imprimanta.printeazaBilet();
	}
	
	public abstract void printeazaVerso();

}
