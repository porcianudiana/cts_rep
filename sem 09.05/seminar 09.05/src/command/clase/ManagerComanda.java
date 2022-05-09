package command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComanda {

	private List<ComandaAbstracta> comenziAbstracte=new ArrayList<>();
	
	
	
	
	public ManagerComanda() {
		
		this.comenziAbstracte = new ArrayList<>();
	}




	public void invoca(ComandaAbstracta comandaAbstracta) {
		
		comenziAbstracte.add(comandaAbstracta);	
		}
	
	
	public void executa() {
		if(comenziAbstracte.isEmpty()) {
			comenziAbstracte.get(0).executa();
			comenziAbstracte.remove(0);
			
		}
		
	}
	
}
