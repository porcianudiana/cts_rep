package state.clase;

import javax.xml.stream.events.StartElement;

public class Autobuz {

	private int nrAutobuz;
	private State stare;
	public Autobuz(int nrAutobuz) {
		super();
		this.nrAutobuz = nrAutobuz;
		this.stare = new LacapatDeLinie();
	}
	
	
	public void pleacaInCursa() {
		new InCursa().doAction(this);
	}
	
	public void ajungeLaCapatDeLinie() {
		new LacapatDeLinie().doAction(this);
	}
	
	
	public void iesireDinService() {
		new LacapatDeLinie().doAction(this);
	}
	
	public void trimiteInService() {
		new LaReparat().doAction(this);
	}
	public State getStare() {
		return stare;
	}
	public int getNrAutobuz() {
		return nrAutobuz;
	}
	public void setNrAutobuz(int nrAutobuz) {
		this.nrAutobuz = nrAutobuz;
	}
	protected void setStare(State stare) {
		this.stare = stare;
	}
	
	
	
	
	
	
}
