package main;

import metrou.ValidatorMetrou;
import seminarul5.adapter_obiecte.Validator;
import seminarul5.adapter_obiecte.ValidatorAutobuz;
import seminarul5.adapter_obiecte.ValidatorSubteranAdapter;
import validator_obiecte.AdapterMetroudeClase;

public class Program {

	public static void valideazaBilet(Validator validator) {
		validator.v_bilet();
	}
	public static void valideazaAbonament(Validator validator) {
		validator.validareAbonament();
	}
	public static void main (String[] args) {
		ValidatorAutobuz validatorAutobuz=new ValidatorAutobuz();
		valideazaBilet(validatorAutobuz);
		ValidatorMetrou validatorMetrou=new ValidatorMetrou();
		ValidatorSubteranAdapter adapter=new ValidatorSubteranAdapter(validatorMetrou);
		valideazaBilet(adapter);
		valideazaAbonament(adapter);
		
		AdapterMetroudeClase adaperAdapterMetroudeClase=new AdapterMetroudeClase();
		valideazaAbonament(adaperAdapterMetroudeClase);
		
	}
}
