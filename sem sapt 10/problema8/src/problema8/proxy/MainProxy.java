package problema8.proxy;

public class MainProxy {
	public static void main(String[] args) {
		Autobuz a1=new Autobuz("42312442", 20);
		Autobuz a2=new Autobuz("2315242", 0);
		
		
		MijlocTransportNoapte mijlocTransportNoapte=new MijlocTransportNoapte(a1);
		MijlocTransportNoapte mijlocTransportNoapte2=new MijlocTransportNoapte(a2);
		
		
		
		a1.opresteInStatie();
		a2.opresteInStatie();
		
		mijlocTransportNoapte.opresteInStatie();
		mijlocTransportNoapte2.opresteInStatie();
	}

}
