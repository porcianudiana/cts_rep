package clase;

public class Facade {
	
	public static Autobuz autobuz=Autobuz.getInstance();
	
	public static void deschideUsi() {
		autobuz.deschideUsiFata();
		autobuz.deschideUsiMijloc();
		autobuz.deschideUsiSpate();
		
		
	}
	
	public static void puneLiberUsi() {
		autobuz.puneLiberUsaFata();
		autobuz.puneLiberUsaMijloc();
		autobuz.puneLiberUsaSpate();
	}

}
