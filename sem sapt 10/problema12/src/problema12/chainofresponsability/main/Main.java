package problema12.chainofresponsability.main;

import problema12.chainofresponsability.AutobuzHandler;
import problema12.chainofresponsability.Handler;
import problema12.chainofresponsability.MetrouHandler;
import problema12.chainofresponsability.TramvaiHandler;
import problema12.chainofresponsability.TroleibuzHandler;

public class Main {

	public static void main(String[] args) {
		
		AutobuzHandler a1=new AutobuzHandler(null,5);
		TroleibuzHandler tr1=new TroleibuzHandler(3);
		TramvaiHandler t1=new TramvaiHandler(10);
		MetrouHandler m1=new MetrouHandler();
		
		tr1.setNextHandler(a1);
		a1.setNextHandler(t1);
		t1.setNextHandler(m1);
		
		tr1.afiseazaCuCatSeDeplaseaza(4);
		tr1.afiseazaCuCatSeDeplaseaza(2);
		tr1.afiseazaCuCatSeDeplaseaza(7);
		tr1.afiseazaCuCatSeDeplaseaza(12);
		
		
		
//in plus
		
		Handler aClujHandler=new AutobuzHandler(null, 3000);
		Handler tClujHandler=new TramvaiHandler(8);
		Handler trClujHandler=new TroleibuzHandler(3);
		
		
		trClujHandler.setNextHandler(tClujHandler);
		tClujHandler.setNextHandler(aClujHandler);
		
	}

}
