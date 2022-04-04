package clase;

public class Autobuz {
	private String numeSoferString;
	private int nrLinie;
	private boolean pauzaSofer;
	private boolean deschideUsi;
	private int oraIncepereProgram;
	private String textRulatString;
	public Autobuz(String numeSoferString, int nrLinie, boolean pauzaSofer, boolean deschideUsi, int oraIncepereProgram,
			String textRulatString) {
		
		this.numeSoferString = numeSoferString;
		this.nrLinie = nrLinie;
		this.pauzaSofer = pauzaSofer;
		this.deschideUsi = deschideUsi;
		this.oraIncepereProgram = oraIncepereProgram;
		this.textRulatString = textRulatString;
	}
	@Override
	public String toString() {
		return "Autobuz{" +
				"numeSofer='"+numeSoferString+'\''+
				"nrLinie='"+nrLinie+'\''+
				"pauzaSofer='"+pauzaSofer+'\''+
				"deschideUsi='"+deschideUsi+'\''+
				"oraIncepereProgram='"+oraIncepereProgram+'\''+
				"textRulatString='"+textRulatString+'\''+
				"}";
	}
	
	
	
	
	
}
