package validator_obiecte;

import adapter_obiecte.Validator;
import metrou.ValidatorMetrou;

public class AdapterMetrouDeClase extends ValidatorMetrou implements Validator{

	@Override
	public void v_bilet() {
		// TODO Auto-generated method stub
		super.validareCalatorie();
	}

}
