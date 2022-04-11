package main;

import FlyweightFactory.FlyweightFactory;
import seminar6.clase.Autobuz;
import seminar6.clase.AutobuzLinie;
import seminar6.clase.Linie;

public class Main {
	
	public static void main(String[] args) {
		
		Autobuz autobuz1=new Autobuz("A1",1995,40);
		Autobuz autobuz2=new Autobuz("A2",1996,30);
		Autobuz autobuz3=new Autobuz("A3",1997,20);
		Autobuz autobuz4=new Autobuz("A4",1998,50);
		
		
	    FlyweightFactory flyweightFactory=new FlyweightFactory();
		Linie linie1=flyweightFactory.getLinie(168);
		Linie linie2=flyweightFactory.getLinie(133);
		
		
		autobuz1.descrieAutobuz(linie1);
		//echivalent cu
		//autobuz1.descrieAutobuz(flyweightFactory.getLinie(168));
		autobuz2.descrieAutobuz(linie1);
		autobuz3.descrieAutobuz(linie2);
		autobuz4.descrieAutobuz(linie2);
		
	}

}
