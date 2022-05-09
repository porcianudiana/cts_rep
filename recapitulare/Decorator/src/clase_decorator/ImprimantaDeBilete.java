package clase_decorator;

public class ImprimantaDeBilete implements Imprimanta{

	private float preB;
	
	public ImprimantaDeBilete(float preB) {
		super();
		this.preB = preB;
	}

	@Override
	public void printeazaBilet() {
		System.out.println("pretul este "+preB);
		
	}
	

}
