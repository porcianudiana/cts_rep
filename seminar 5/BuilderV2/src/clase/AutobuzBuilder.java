package clase;

public class AutobuzBuilder implements Builder{

	
	private String numeSoferString;
	private int nrLinie;
	private boolean pauzaSofer;
	private boolean deschideUsi;
	private int oraIncepereProgram;
	private String textRulatString;
	
	public AutobuzBuilder() {
		
		this.numeSoferString = "sofer";
		this.nrLinie = 0;
		this.pauzaSofer = true;
		this.deschideUsi = true;
		this.oraIncepereProgram = 9;
		this.textRulatString = "text";
	}

	@Override
	public Autobuz build() {
		return new Autobuz(this.numeSoferString,this.nrLinie,this.pauzaSofer,this.deschideUsi,this.oraIncepereProgram,this.textRulatString);
	
	}

	public AutobuzBuilder setNumeSoferString(String numeSoferString) {
		this.numeSoferString=numeSoferString;
		return this;
	}
	public AutobuzBuilder setNrLinie(int nrLinie) {
		this.nrLinie=nrLinie;
		return this;
	}
	public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
		this.pauzaSofer=pauzaSofer;
		return this;
	}
	public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
		this.deschideUsi=deschideUsi;
		return this;
	}
	public AutobuzBuilder setOraIncepereProgram(int oraIncepereProgram) {
		this.oraIncepereProgram=oraIncepereProgram;
		return this;
	}
	public AutobuzBuilder setTextRulatString(String textRulatString) {
		this.textRulatString=textRulatString;
		return this;
	}
	
	
	

}
