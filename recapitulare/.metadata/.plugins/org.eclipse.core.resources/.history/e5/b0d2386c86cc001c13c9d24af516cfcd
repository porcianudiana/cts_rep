package clase;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
	
	Map<Integer, Linie> linieMap;

	public Flyweight() {
		linieMap=new HashMap<>();
	}

	public Map<Integer, Linie> getLinieMap() {
		return linieMap;
	}

	public Linie getLinie(Integer nrLinie) {
		Linie linieDeReturnatLinie=linieMap.get(nrLinie);
		if(linieDeReturnatLinie!=null) {
			return linieDeReturnatLinie;
		}else {
			linieDeReturnatLinie=new Linie(nrLinie, "prima statie", "ultima statie");
			linieMap.put(linieDeReturnatLinie.getNrLinieInteger(), linieDeReturnatLinie);
			return linieDeReturnatLinie;
		}
	}

}
