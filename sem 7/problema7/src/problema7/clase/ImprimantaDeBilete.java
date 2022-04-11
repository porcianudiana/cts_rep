package problema7.clase;

public class ImprimantaDeBilete  implements Imprimanta{

	private float pretBilet;
	
	
	
	public ImprimantaDeBilete(float pretBilet) {
		super();
		this.pretBilet = pretBilet;
	}



	@Override
	public void printeazaBilet() {
		System.out.println("Pretul biletului este "+pretBilet+" lei.");
	}

}
