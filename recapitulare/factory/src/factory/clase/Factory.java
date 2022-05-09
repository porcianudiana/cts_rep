package factory.clase;

public class Factory {

	public MijlocTransport geMijlocTransport(TipTransport tip, int nrinmatriculare) {
		switch (tip) {
		case AUTOBUZ: 
			return new Autobuz(nrinmatriculare);
		case TRAMVAI:
			return new Tramvai(nrinmatriculare);
		case TROLEIBUZ:
			return new Troleibuz(nrinmatriculare);
		default:
			return null;
		}
	}
}
