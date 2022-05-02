package problema12.chainofresponsability;

public class AutobuzHandler extends Handler{

	public AutobuzHandler(Handler nextHandler, int prag) {
		super(nextHandler, prag);
		
	}

	@Override
	public void afiseazaCuCatSeDeplaseaza(int distanta) {
		if(distanta<prag) {
			System.out.println("Te poti deplasa cu autobuzul");
		}else {
			nextHandler.afiseazaCuCatSeDeplaseaza(distanta);
		}
		
	}

	

	
}
