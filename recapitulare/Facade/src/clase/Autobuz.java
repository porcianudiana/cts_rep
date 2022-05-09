package clase;

public class Autobuz {
	
	private static Autobuz autobuz=null;
	
	private Autobuz() {
		
	}
	
	public void deschideUsiFata() {
		System.out.println("Usa din fata deschisa");
	}
		
	public void deschideUsiMijloc() {
		System.out.println("Usa din mijloc deschisa");
	}
	public void deschideUsiSpate() {
		System.out.println("Usa din spate deschisa");
	}
	public void puneLiberUsaFata() {
		System.out.println("Usa din fata pusa pe liber");
	}
	public void puneLiberUsaMijloc() {
		System.out.println("Usa din mijloc pusa pe liber");
	}
	public void puneLiberUsaSpate() {
		System.out.println("Usa din spate pusa pe liber");
	}
	
	public static Autobuz getInstance() {
		if(autobuz!=null) {
			return autobuz;
		}else {
			autobuz=new Autobuz();
			return autobuz;
		}
	}

}
