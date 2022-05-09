package main;

import factoryMethod.clase.FactoryAutobuz;
import factoryMethod.clase.FactoryMijlocTransport;
import factoryMethod.clase.FactoryTramvai;
import factoryMethod.clase.FactoryTroleibuz;
import factoryMethod.clase.MijlocTransport;

public class Main {
	private static void afisareMijloctransport(FactoryMijlocTransport f,int nrinmatriculare) {
		MijlocTransport mTransport=f.geMijlocTransport(nrinmatriculare);
		System.out.println(mTransport.toString());
		
	}

	public static void main(String[] args) {
		MijlocTransport aMijlocTransport=new FactoryAutobuz().geMijlocTransport(1);
		MijlocTransport tMijlocTransport=new FactoryTramvai().geMijlocTransport(2);
		MijlocTransport trMijlocTransport=new FactoryTroleibuz().geMijlocTransport(3);
		
		
		System.out.println(aMijlocTransport.toString());
		System.out.println(tMijlocTransport.toString());
		System.out.println(trMijlocTransport.toString());
		

		afisareMijloctransport(new FactoryAutobuz(), 100);
		afisareMijloctransport(new FactoryTramvai(), 102);
		afisareMijloctransport(new FactoryTroleibuz(), 102);
	}

}
