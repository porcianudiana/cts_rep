package factory;

public class FactoryTroleibuz implements FactoryMijlocTransport{

	@Override
    public MijlocTransport getMijlocTransport(int nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }

}
