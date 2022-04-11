package problema6.clase;

import java.util.ArrayList;
import java.util.List;

public class Flota implements IItem{

	private String numeString;
	private List<IItem> items;
	
	
	
	public Flota(String numeString) {
		
		this.numeString = numeString;
		items=new ArrayList<>();
	}

	@Override
	public void adaugaItem(IItem iItem) throws Exception {
		// TODO Auto-generated method stub
		items.add(iItem);
	}

	@Override
	public void stergeItem(IItem iItem) throws Exception {
		// TODO Auto-generated method stub
		items.remove(iItem);
	}

	@Override
	public void descriereItem() {
		// TODO Auto-generated method stub
		System.out.println(numeString);
		for(IItem item:items) {
			item.descriereItem();
		}
	}

	@Override
	public IItem getItem(int pozitie) throws Exception {
		// TODO Auto-generated method stub
		return items.get(pozitie);
	}

	@Override
	public float calculeazaSumaGarantat(float pretPerLoc) {
		float suma=0;
		for(IItem item:items) {
			suma+=item.calculeazaSumaGarantat(pretPerLoc);
		}
		return suma;	}

}
