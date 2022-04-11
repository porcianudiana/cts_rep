package clase;

public class Autobuz extends MijlocTransport{
	private int nrLinie;
	
	

	public Autobuz(int nrLinie) {
		super();
		this.nrLinie = nrLinie;
	}



	@Override
	public void anuntaCalatori() {
		for(Icalator c:calatori) {
			c.primesteNotificare("Autobuzul "+ nrLinie +" a plecat de la capatul liniei");
		}
		
	}

	
}
