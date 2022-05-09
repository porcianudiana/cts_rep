package clase;

public class Autobuz implements MijlocTransport{

	private String nrAutobuzString;
	private int nrCalatori;
	
	
	
	public Autobuz(String nrAutobuzString, int nrCalatori) {
		super();
		this.nrAutobuzString = nrAutobuzString;
		this.nrCalatori = nrCalatori;
	}

	@Override
	public void opresteInStatie() {
		System.out.println("Autobuz [nrAutobuz=" + nrAutobuzString + ", nrCalatori=" + nrCalatori + "]");
		
	}

	@Override
	public int getNrCalatori() {
		// TODO Auto-generated method stub
		return nrCalatori;
	}
	
	

}
