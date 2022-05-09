package main;

import clase.Autobuz;
import clase.Flyweight;
import clase.Linie;

public class Main {

	public static void main(String[] args) {
		Autobuz a1=new Autobuz("A1", 1995, 40);
		Autobuz autobuz2=new Autobuz("A2",1996,30);
		Autobuz autobuz3=new Autobuz("A3",1997,20);
		Autobuz autobuz4=new Autobuz("A4",1998,50);
		
		
		Flyweight flyweight=new Flyweight();
		Linie l1=flyweight.getLinie(168);
		Linie l2=flyweight.getLinie(133);
		
		a1.descrieAutobuz(l1);
		autobuz2.descrieAutobuz(l1);
		autobuz3.descrieAutobuz(l2);
		autobuz4.descrieAutobuz(l2);

	}

}
