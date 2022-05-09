package proxy_2.main;

import proxy_2.clase.Bilet;
import proxy_2.clase.BiletCuPretRedus;

public class Main {

	public static void main(String[] args) {
		Bilet b1=new Bilet(100156, 200);
		Bilet b2=new Bilet(100230,90);
		Bilet b3=new Bilet(100087,100);
		
		BiletCuPretRedus bilet1=new BiletCuPretRedus(b1);
		BiletCuPretRedus bilet2=new BiletCuPretRedus(b2);
		BiletCuPretRedus bilet3=new BiletCuPretRedus(b3);
		
		b1.anulareRezervare();
		b2.anulareRezervare();
		b3.anulareRezervare();
		
		bilet1.anulareRezervare();
		bilet2.anulareRezervare();
		bilet3.anulareRezervare();

	}

}
