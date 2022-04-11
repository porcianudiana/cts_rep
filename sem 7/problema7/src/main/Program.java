package main;

import problema7.clase.Decorator;
import problema7.clase.DecoratorAbstract;
import problema7.clase.Imprimanta;
import problema7.clase.ImprimantaDeBilete;

public class Program {
	public static void main(String[] args) {
		Imprimanta imprimanta=new ImprimantaDeBilete(5);
		imprimanta.printeazaBilet();
		
		
		DecoratorAbstract decorator=new Decorator(imprimanta,"Paste Fericit");
		
		decorator.printeazaBilet();
		decorator.printeazaVerso();
		
	}

}
