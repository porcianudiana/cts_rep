package Adapter_5.main;

import Adapter_5.clase.Adapter;
import Adapter_5.clase.MedicamentFarmacie;
import Adapter_5.clase.MedicamentSpital;
import Adapter_5.clase.SoftFarmacie;
import Adapter_5.clase.SoftSpital;

public class Main {

	public static void main(String[] args) {
		SoftSpital softSpital= new MedicamentSpital(false);
		softSpital.prezintaReteta(false);
		
		SoftFarmacie softFarmacie=(SoftFarmacie) new Adapter();
		softFarmacie.cumparaMedicament();
			
		

	}

}