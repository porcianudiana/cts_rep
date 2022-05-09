package memento.clase;

public class MementoAutobuz {

	
	private String numeSoferString;
	private float consumMediu;
	public MementoAutobuz(String numeSoferString, float consumMediu) {
		super();
		this.numeSoferString = numeSoferString;
		this.consumMediu = consumMediu;
	}
	
	
	
	public String getNumeSoferString() {
		return numeSoferString;
	}



	public void setNumeSoferString(String numeSoferString) {
		this.numeSoferString = numeSoferString;
	}



	public float getConsumMediu() {
		return consumMediu;
	}



	public void setConsumMediu(float consumMediu) {
		this.consumMediu = consumMediu;
	}



	@Override
	public String toString() {
		return "MementoAutobuz [numeSoferString=" + numeSoferString + ", consumMediu=" + consumMediu + "]";
	}
	
	
}
