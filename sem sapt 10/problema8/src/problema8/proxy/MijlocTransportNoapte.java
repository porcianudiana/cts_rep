package problema8.proxy;

public class MijlocTransportNoapte implements MijlocTransport {
	
	private MijlocTransport mijlocTransport;

	
	
	
	public MijlocTransportNoapte(MijlocTransport mijlocTransport) {
		super();
		this.mijlocTransport = mijlocTransport;
	}

	@Override
	public void opresteInStatie() {
		if(mijlocTransport.getNrCalatori()>0)
			mijlocTransport.opresteInStatie();
		else {
			System.out.println("Autobuzul de noapte nu opreste");
		}
	}

	@Override
	public int getNrCalatori() {
		// TODO Auto-generated method stub
		return mijlocTransport.getNrCalatori();
	}
	
	

}
