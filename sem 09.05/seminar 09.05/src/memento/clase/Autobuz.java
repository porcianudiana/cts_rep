package memento.clase;

public class Autobuz {

	
	
	private String modelString;
	private String numeSoferString;
	private float consumMediu;
	private int anFabricatie;
	
	public Autobuz(String modelString, String numeSoferString, float consumMediu, int anFabricatie) {
		super();
		this.modelString = modelString;
		this.numeSoferString = numeSoferString;
		this.consumMediu = consumMediu;
		this.anFabricatie = anFabricatie;
	}
	
	
	
	public void setModelString(String modelString) {
		this.modelString = modelString;
	}



	public void setNumeSoferString(String numeSoferString) {
		this.numeSoferString = numeSoferString;
	}



	public void setConsumMediu(float consumMediu) {
		this.consumMediu = consumMediu;
	}



	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}



	public MementoAutobuz creareMemento() {
		
		
		return new MementoAutobuz(this.numeSoferString, this.consumMediu);
		
	}
	
	public void revenireStareAnterioara(MementoAutobuz mementoAutobuz) {
		this.numeSoferString = mementoAutobuz.getNumeSoferString();
        this.consumMediu = mementoAutobuz.getConsumMediu();
				
	}



	@Override
	public String toString() {
		return "Autobuz [modelString=" + modelString + ", numeSoferString=" + numeSoferString + ", consumMediu="
				+ consumMediu + ", anFabricatie=" + anFabricatie + "]";
	}
	
	
}
