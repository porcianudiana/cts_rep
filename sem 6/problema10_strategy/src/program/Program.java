package program;

import problema10_strategy.clase.SMS;
import problema10_strategy.clase.Validator;

public class Program {

	public static void main(String[] args) {
		
		Validator validator=new Validator(3);
		validator.valideazaCalatorie();
		
		validator.setModPlata(new SMS());
		validator.valideazaCalatorie();
		
	}
}
