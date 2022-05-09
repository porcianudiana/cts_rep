package main;

import factory.clase.Factory;
import factory.clase.MijlocTransport;
import factory.clase.TipTransport;

public class Main {
	public static void main(String[] args) {
		Factory fabFactory=new Factory();
		MijlocTransport m1=fabFactory.geMijlocTransport(TipTransport.AUTOBUZ, 1);
		MijlocTransport m2=fabFactory.geMijlocTransport(TipTransport.TRAMVAI,2 );
		MijlocTransport m3=fabFactory.geMijlocTransport(TipTransport.TROLEIBUZ, 3);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
	}

}
