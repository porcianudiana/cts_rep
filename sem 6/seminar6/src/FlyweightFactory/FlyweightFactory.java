package FlyweightFactory;

import java.util.HashMap;
import java.util.Map;

import seminar6.clase.Linie;

public class FlyweightFactory {
	
	Map<Integer, Linie> linieMap;
	
	public FlyweightFactory() {
		linieMap=new HashMap<>();
	}
	
	public Linie getLinie(Integer nrLinie) {
		
		
		Linie linieDeReturnat=linieMap.get(nrLinie);
		if(linieDeReturnat!=null) {
			return linieDeReturnat;
		}
		else {
		
		linieDeReturnat=new Linie(nrLinie, "prima statie", "ultima statie"); 
		linieMap.put(linieDeReturnat.getNrLinieInteger(), linieDeReturnat);
		return linieDeReturnat;
	     }
	}

}
