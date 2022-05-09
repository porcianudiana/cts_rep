package simpleFactory_2.main;

import simpleFactory_2.clase.Factory;
import simpleFactory_2.clase.PersonalSpital;
import simpleFactory_2.clase.TipPersonalSpital;

public class Main {

	public static void main(String[] args) {
		Factory factory=new Factory();
		PersonalSpital brancardierPersonalSpital=factory.getPersonalSpital(TipPersonalSpital.BRANCARDIER, "Popa", 102982);
		PersonalSpital asistentPersonalSpital=factory.getPersonalSpital(TipPersonalSpital.ASISTENT,"Lucescu", 52425);
		PersonalSpital medicPersonalSpital=factory.getPersonalSpital(TipPersonalSpital.MEDIC,"Ionescu", 62422);
		
		
		System.out.println(brancardierPersonalSpital.toString());
		System.out.println(asistentPersonalSpital.toString());
		System.out.println(medicPersonalSpital.toString());

	}

}
