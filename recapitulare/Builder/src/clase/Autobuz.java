package clase;

public class Autobuz {
	
	private String numeString;
	private int nrLinie;
	private boolean auzaSofer;
	private boolean deschideUsi;
	private int oraIncepereProgram;
	private String textRulatString;
	public Autobuz(String numeString, int nrLinie, boolean auzaSofer, boolean deschideUsi, int oraIncepereProgram,
			String textRulatString) {
		super();
		this.numeString = numeString;
		this.nrLinie = nrLinie;
		this.auzaSofer = auzaSofer;
		this.deschideUsi = deschideUsi;
		this.oraIncepereProgram = oraIncepereProgram;
		this.textRulatString = textRulatString;
	}
	@Override
	public String toString() {
		return "Autobuz [numeString=" + numeString + ", nrLinie=" + nrLinie + ", auzaSofer=" + auzaSofer
				+ ", deschideUsi=" + deschideUsi + ", oraIncepereProgram=" + oraIncepereProgram + ", textRulatString="
				+ textRulatString + "]";
	}
	public void setNumeString(String numeString) {
		this.numeString = numeString;
	}
	public void setNrLinie(int nrLinie) {
		this.nrLinie = nrLinie;
	}
	public void setAuzaSofer(boolean auzaSofer) {
		this.auzaSofer = auzaSofer;
	}
	public void setDeschideUsi(boolean deschideUsi) {
		this.deschideUsi = deschideUsi;
	}
	public void setOraIncepereProgram(int oraIncepereProgram) {
		this.oraIncepereProgram = oraIncepereProgram;
	}
	public void setTextRulatString(String textRulatString) {
		this.textRulatString = textRulatString;
	}
	
	

}
