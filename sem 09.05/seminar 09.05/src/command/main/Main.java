package command.main;

import command.clase.Autobuz;
import command.clase.ComandaAbstracta;
import command.clase.ManagerComanda;
import command.clase.PleacaInCursa;

public class Main {

	public static void main(String[] args) {
		
		Autobuz a1=new Autobuz("Mercedes");
		Autobuz a2=new Autobuz("BMW");
		Autobuz a3=new Autobuz("Dacia");
		
		ComandaAbstracta c1=new PleacaInCursa(a1, 331);
		ManagerComanda mComanda=new ManagerComanda();
		
		mComanda.invoca(new PleacaInCursa(a1, 331));
		mComanda.invoca(new PleacaInCursa(a2, 343));
		mComanda.invoca(new PleacaInCursa(a3, 351));
		mComanda.invoca(new PleacaInCursa(a1, 981));
		mComanda.invoca(new PleacaInCursa(a2, 931));
		mComanda.invoca(new PleacaInCursa(a3, 361));
		
		
		mComanda.executa();
		mComanda.executa();
		mComanda.executa();
		mComanda.executa();
		

	}

}
