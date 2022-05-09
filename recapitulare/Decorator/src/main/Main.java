package main;

import clase_decorator.Decorator;
import clase_decorator.DecoratorAbstract;
import clase_decorator.Imprimanta;
import clase_decorator.ImprimantaDeBilete;

public class Main {
	public static void main(String[] args) {
		Imprimanta imprimanta=new ImprimantaDeBilete(5);
		imprimanta.printeazaBilet();
		
		
		DecoratorAbstract decorator=new Decorator(imprimanta,"Paste Fericit");
		
		decorator.printeazaBilet();
		decorator.printeazaVerso();
		
	}

}
