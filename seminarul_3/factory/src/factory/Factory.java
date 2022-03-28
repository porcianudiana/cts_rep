package factory;

public class Factory {
    public MijlocTransport getMijlocTransport(TipTransport tipMijlocTransport, int nrInmatriculare) {
        switch (tipMijlocTransport) {
            case AUTOBUZ:
                return new Autobuz(nrInmatriculare);
            case TRAMVAI:
                return new Tramvai(nrInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(nrInmatriculare);
            default:
                return null;
        }
    }
}
