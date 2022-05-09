package FactoryMethod_3.main;

import FactoryMethod_3.clase.FactoryAsistent;
import FactoryMethod_3.clase.FactoryBrancardier;
import FactoryMethod_3.clase.FactoryMedic;
import FactoryMethod_3.clase.FactoryPersonalSpital;
import FactoryMethod_3.clase.PersonalSpital;

public class Main {
	
	private static void afisarePersonalSpital(FactoryPersonalSpital factoryPersonalSpital,String numePersonalString, int codPersonal) {
		PersonalSpital personalSpital=factoryPersonalSpital.getPersonalSpital(numePersonalString, codPersonal);
		System.out.println(personalSpital.toString());
	}

	public static void main(String[] args) {
		afisarePersonalSpital(new FactoryBrancardier(), "Luca", 756565);
		afisarePersonalSpital(new FactoryAsistent(), "Mircea", 351313);
		afisarePersonalSpital(new FactoryMedic(), "Ion", 874746);
		
		

	}

}
