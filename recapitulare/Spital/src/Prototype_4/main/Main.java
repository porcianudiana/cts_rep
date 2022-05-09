package Prototype_4.main;


import Prototype_4.clase.Antibiotic;
import Prototype_4.clase.Anticonceptional;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Antibiotic a1=new Antibiotic("Klabax");
		Anticonceptional a2=new Anticonceptional("A");
		
		Antibiotic antibiotic=(Antibiotic)a1.copiaza();
		Anticonceptional anticonceptional=(Anticonceptional)a2.copiaza();
		
		System.out.println(a2.toString());
		System.out.println(anticonceptional.toString());
		System.out.println(a1.toString());
		System.out.println(antibiotic.toString());

	}

}
