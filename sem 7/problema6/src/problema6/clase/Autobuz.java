package problema6.clase;

public class Autobuz implements IItem{

	private String producatorString;
	private String modelString;
	private int nrLocuri;
	
	
	public Autobuz(String producatorString, String modelString, int nrLocuri) {
		super();
		this.producatorString = producatorString;
		this.modelString = modelString;
		this.nrLocuri = nrLocuri;
	}

	@Override
	public void adaugaItem(IItem iItem) throws Exception {
		throw  new Exception("Nepermis");
		
	}

	@Override
	public void stergeItem(IItem iItem) throws Exception {
		throw  new Exception("Nepermis");
		
	}

	@Override
	public void descriereItem() {
		System.out.println(this.toString());
		
	}

	@Override
	public IItem getItem(int pozitie) throws Exception {
		
		throw  new Exception("Nepermis");
	}

	@Override
	public float calculeazaSumaGarantat(float pretPerLoc) {
		
		return pretPerLoc*nrLocuri+modelString.length();
	}

	@Override
	public String toString() {
		return "Autobuz [producatorString=" + producatorString + ", modelString=" + modelString + ", nrLocuri="
				+ nrLocuri + "]";
	}

	
}
