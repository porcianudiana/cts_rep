package FactoryMethod_3.clase;

public class FactoryBrancardier implements FactoryPersonalSpital{

	@Override
	public PersonalSpital getPersonalSpital(String numePersonalString, int codPersonal) {
		// TODO Auto-generated method stub
		return new Brancardier(numePersonalString, codPersonal);
	}

}
