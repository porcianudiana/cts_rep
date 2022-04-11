package main;

import clase.Autobuz;
import clase.Calator;
import clase.Icalator;
import clase.MijlocTransport;

public class Program {

	public static void main(String [] args) {
		
		MijlocTransport autobuz=new Autobuz(168);
		Icalator c1=new Calator("Popescu");
		Icalator c2=new Calator("Ionescu");
		Icalator c3=new Calator("Enescu");
		
		
		autobuz.adaugaCalator(c1);
		autobuz.adaugaCalator(c2);
		autobuz.anuntaCalatori();
		
		autobuz.stergeCalator(c2);
		autobuz.adaugaCalator(c3);
		
		autobuz.anuntaCalatori();
	}
}
