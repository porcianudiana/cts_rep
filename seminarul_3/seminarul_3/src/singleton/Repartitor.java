package singleton;

public class Repartitor {
	
	private static Repartitor repartitor=null;
	
	
	private Repartitor() {
		
	}

	public static synchronized Repartitor getInstance() {
		if(repartitor==null) {
			//fir 1
			//fir 2
			repartitor=new Repartitor();
		}
		return repartitor;
	}
}
