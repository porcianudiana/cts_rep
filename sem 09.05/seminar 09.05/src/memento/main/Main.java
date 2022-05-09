package memento.main;

import memento.clase.Autobuz;
import memento.clase.ManagerAutobuze;

public class Main {
	
	public static void main(String[] args) {
		Autobuz autobuz=new Autobuz("autobuz", "Mircea", 20, 1990);
		
		ManagerAutobuze managerAutobuze=new ManagerAutobuze();
		
		managerAutobuze.adaugareMemento(autobuz.creareMemento());
		autobuz.setNumeSoferString("Popescu");
		managerAutobuze.adaugareMemento(autobuz.creareMemento());
		
		autobuz.setConsumMediu(15);
		
		managerAutobuze.adaugareMemento(autobuz.creareMemento());		
		System.out.println(autobuz.toString());
		
		
		
		
		autobuz.revenireStareAnterioara(managerAutobuze.getMementoAutobuz(0));
		
		System.out.println(autobuz.toString());
		}

}
