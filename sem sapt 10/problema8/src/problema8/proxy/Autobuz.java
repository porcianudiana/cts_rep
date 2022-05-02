package problema8.proxy;

public class Autobuz implements MijlocTransport{

	private String nrAutobuz;
	private int nrCalatori;
	public Autobuz(String nrAutobuz, int nrCalatori) {
		super();
		this.nrAutobuz = nrAutobuz;
		this.nrCalatori = nrCalatori;
	}
	@Override
	public void opresteInStatie() {
		System.out.println("Autobuz [nrAutobuz=" + nrAutobuz + ", nrCalatori=" + nrCalatori + "]");
	}
	@Override
	public int getNrCalatori() {
		return nrCalatori;
	}
	
	
	
}
