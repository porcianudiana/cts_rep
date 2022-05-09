package factoryMethod.clase;

public class FactoryTramvai implements FactoryMijlocTransport{

	@Override
	public MijlocTransport geMijlocTransport(int nrinmatriculare) {
		// TODO Auto-generated method stub
		return new Tramvai(nrinmatriculare);
	}

}
