package state.clase;

public class InCursa implements State{

	@Override
	public void doAction(Autobuz autobuz) {
		if(autobuz.getStare() instanceof LacapatDeLinie) {
			System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" pleaca in cursa");
			autobuz.setStare(this);
		}else {
			System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" este in  cursa");
		}
		
	}

}
