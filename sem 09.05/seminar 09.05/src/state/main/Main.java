package state.main;

import state.clase.Autobuz;
import state.clase.LacapatDeLinie;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz=new Autobuz(99);
		
		autobuz.trimiteInService();
		autobuz.pleacaInCursa();
		autobuz.iesireDinService();
		autobuz.pleacaInCursa();
		autobuz.trimiteInService();
		//autobuz.setStare(new LacapatDeLinie());
		autobuz.ajungeLaCapatDeLinie();
	}
}
