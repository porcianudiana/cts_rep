package problema14.template.main;

import problema14.template.MijlocTransportPeSine;
import problema14.template.Tramvai;

public class Main {

	
	public static void main(String[] args) {
		MijlocTransportPeSine t1=new Tramvai();
		t1.parcurgeTraseuInSensNormal();
		System.out.println("==========================");
		t1.parcurgeTraseuInSensInvers();
		
		
		
		//t1.opresteStatie2();
	}
}
