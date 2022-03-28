package factory.main;

import factory.Factory;
import factory.MijlocTransport;
import factory.TipTransport;

public class Program {
    public static void main(String[] args) {
        Factory fabrica = new Factory();
        MijlocTransport autobuz = fabrica.getMijlocTransport(TipTransport.AUTOBUZ, 1);
        MijlocTransport troleibuz = fabrica.getMijlocTransport(TipTransport.TROLEIBUZ, 2);
        MijlocTransport tramvai = fabrica.getMijlocTransport(TipTransport.TRAMVAI, 3);

        System.out.println(autobuz.toString());
        System.out.println(troleibuz.toString());
        System.out.println(tramvai.toString());
    }
}
