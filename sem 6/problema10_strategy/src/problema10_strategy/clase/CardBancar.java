package problema10_strategy.clase;

public class CardBancar implements ModPlata{

	@Override
	public void plateste(float pret) {
		System.out.println("A fost realizata plata cu card bancar in valoare de "+pret);
	}
	
	

}
