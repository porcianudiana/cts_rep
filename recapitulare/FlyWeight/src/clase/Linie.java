package clase;

public class Linie {

	private Integer nrLinieInteger;
	private String primaStatieString;
	private String ultimaStatieString;
	public Linie(Integer nrLinieInteger, String primaStatieString, String ultimaStatieString) {
		super();
		this.nrLinieInteger = nrLinieInteger;
		this.primaStatieString = primaStatieString;
		this.ultimaStatieString = ultimaStatieString;
	}
	public Integer getNrLinieInteger() {
		return nrLinieInteger;
	}
	public void setNrLinieInteger(Integer nrLinieInteger) {
		this.nrLinieInteger = nrLinieInteger;
	}
	public String getPrimaStatieString() {
		return primaStatieString;
	}
	public void setPrimaStatieString(String primaStatieString) {
		this.primaStatieString = primaStatieString;
	}
	public String getUltimaStatieString() {
		return ultimaStatieString;
	}
	public void setUltimaStatieString(String ultimaStatieString) {
		this.ultimaStatieString = ultimaStatieString;
	}
	@Override
	public String toString() {
		return "Linie [nrLinieInteger=" + nrLinieInteger + ", primaStatieString=" + primaStatieString
				+ ", ultimaStatieString=" + ultimaStatieString + "]";
	}
	
	
}
