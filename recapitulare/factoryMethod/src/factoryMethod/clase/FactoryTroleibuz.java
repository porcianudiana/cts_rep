package factoryMethod.clase;

public class FactoryTroleibuz implements FactoryMijlocTransport{

	@Override
	public MijlocTransport geMijlocTransport(int nrinmatriculare) {
		// TODO Auto-generated method stub
		return new Troleibuz(nrinmatriculare);
	}

}
