package clase;

public class AutobuzBuilder implements Builder{
	
	private Autobuz autobuz;
	
	

	public AutobuzBuilder() {
		this.autobuz = new Autobuz("Sofer",2,true, true,7,"Statia finala");
	}



	@Override
	public Autobuz build() {
		// TODO Auto-generated method stub
		return autobuz;
	}
	
	public AutobuzBuilder setNumeString(String numeString) {
		this.autobuz.setNumeString(numeString);
		return this;
	}
	public AutobuzBuilder setNrLinie(int nrLinie) {
		this.autobuz.setNrLinie(nrLinie);
		return this;
	}
	public AutobuzBuilder setAuzaSofer(boolean auzaSofer) {
		this.autobuz.setAuzaSofer(auzaSofer);
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
