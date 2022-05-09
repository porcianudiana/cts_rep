package simple_factory_1.main;


import simple_factory_1.clase.Bilet;
import simple_factory_1.clase.SimpleFactory;
import simple_factory_1.clase.TipBilet;

public class Main {

	public static void main(String[] args) {
		SimpleFactory simple_Factory=new SimpleFactory();
		Bilet economic_class_Bilet_1=simple_Factory.getBilet(TipBilet.ECONOMIC_CLASS, 12);
		Bilet business_class_Bilet_1=simple_Factory.getBilet(TipBilet.BUSINESS_CLASS, 23);
		Bilet economic_class_Bilet_2=simple_Factory.getBilet(TipBilet.ECONOMIC_CLASS, 13);
		Bilet business_class_Bilet_2=simple_Factory.getBilet(TipBilet.BUSINESS_CLASS, 24);

		
		System.out.println(economic_class_Bilet_1.toString());
		System.out.println(economic_class_Bilet_2.toString());
		System.out.println(business_class_Bilet_1.toString());
		System.out.println(business_class_Bilet_2.toString());
	}

}
