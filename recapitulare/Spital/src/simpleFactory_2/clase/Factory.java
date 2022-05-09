package simpleFactory_2.clase;

public class Factory {

	public PersonalSpital getPersonalSpital(TipPersonalSpital tip,String numePersonalString, int codPersonal ) {
		switch (tip) {
		case BRANCARDIER: 
			return new Brancardier(numePersonalString, codPersonal);
		case ASISTENT:
			return new Asistent(numePersonalString, codPersonal);
		case MEDIC:
			return new Medic(numePersonalString, codPersonal);
			
		default:
			return null;
		}
	}
}
