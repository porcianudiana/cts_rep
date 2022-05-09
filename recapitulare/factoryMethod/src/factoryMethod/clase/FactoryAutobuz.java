package factoryMethod.clase;

public class FactoryAutobuz implements FactoryMijlocTransport{

	@Override
	public MijlocTransport geMijlocTransport(int nrinmatriculare) {
		// TODO Auto-generated method stub
		return new Autobuz(nrinmatriculare);
	}
	

}
