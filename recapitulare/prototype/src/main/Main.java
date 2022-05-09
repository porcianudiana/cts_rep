package main;

import prototype.clase.Autobuz;
import prototype.clase.Tramvai;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{
		
		Autobuz autobuz=new Autobuz("Petre");
		Tramvai tramvai=new Tramvai("Nicu");
		
		Autobuz a1=(Autobuz) autobuz.copiaza();
		Tramvai tramvai2=(Tramvai) tramvai.copiaza();
		
		System.out.println(autobuz.toString());
		System.out.println(a1.toString());
		System.out.println(tramvai.toString());
		System.out.println(tramvai2.toString());
		

	}

}
