package state.clase;

public class LaReparat implements State{

	@Override
	public void doAction(Autobuz autobuz) {
		if(autobuz.getStare() instanceof LacapatDeLinie) {
			System.out.println("Autobuzul cu nr "+autobuz.getNrAutobuz()+" intra in service");
			autobuz.setStare(this);
		}else {
			System.out.println("Autobuzul cu nr"+autobuz.getNrAutobuz()+" trebuie sa ajunga la capat de linie");
		}
	}

}
