package command.clase;

public class PleacaInCursa implements ComandaAbstracta{
	
	
	private Autobuz autobuz;
	private int nrLinie;
	

	
	
	public PleacaInCursa(Autobuz autobuz, int nrLinie) {
		super();
		this.autobuz = autobuz;
		this.nrLinie = nrLinie;
	}




	@Override
	public void executa() {
		
		autobuz.pleacaInCursa(nrLinie);
	}

}
