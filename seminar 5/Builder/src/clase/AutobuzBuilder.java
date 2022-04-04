package clase;

public class AutobuzBuilder implements Builder{

	
	private Autobuz autobuz;
	
	public AutobuzBuilder() {
		
		this.autobuz = new Autobuz("Sofer",2,true, true,7,"Statia finala");
	}

	@Override
	public Autobuz build() {
		return autobuz;
	}

	public AutobuzBuilder setNumeSoferString(String numeSoferString) {
		this.autobuz.setNumeSoferString(numeSoferString);
		return this;
	}
	public AutobuzBuilder setNrLinie(int nrLinie) {
		this.autobuz.setNrLinie(nrLinie);
		return this;
	}
	public AutobuzBuilder setPauzaSofer(boolean pauzaSofer) {
		this.autobuz.setPauzaSofer(pauzaSofer);
		return this;
	}
	public AutobuzBuilder setDeschideUsi(boolean deschideUsi) {
		this.autobuz.setDeschideUsi(deschideUsi);
		return this;
	}
	public AutobuzBuilder setOraIncepereProgram(int oraIncepereProgram) {
		this.autobuz.setOraIncepereProgram(oraIncepereProgram);
		return this;
	}
	public AutobuzBuilder setTextRulatString(String textRulatString) {
		this.autobuz.setTextRulatString(textRulatString);
		return this;
	}
	
	
	

}
