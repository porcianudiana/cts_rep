package clase;



public interface IItem {
	
	void adaugaItem(IItem iItem)throws Exception;
	void stergeItem(IItem iItem)throws Exception;
	void descriereItem();
	IItem getIItem(int pozitie) throws Exception;
	float calculeazaSumaGarantat(float pretPerLoc);

}
