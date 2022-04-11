package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport {

	protected List<Icalator> calatori;
	
	
	
	public MijlocTransport() {
		this.calatori=new ArrayList<>();
	}
	public void adaugaCalator(Icalator calator) {
		calatori.add(calator);
		}
	public void stergeCalator(Icalator calator) {
		calatori.remove(calator);	}
	public abstract void anuntaCalatori();
}
