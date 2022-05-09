package main;

import clase.Autobuz;
import clase.Flota;

public class Main {

	public static void main(String[] args) {
		Autobuz a1=new Autobuz("Audi", "A1", 10);
		Autobuz a2=new Autobuz("Audi", "A1", 7);
		Autobuz a3=new Autobuz("Audi", "A1", 30);
		Autobuz a4=new Autobuz("Audi", "A1", 100);
		Autobuz a5=new Autobuz("Audi", "A1", 30);
		Autobuz a6=new Autobuz("Audi", "A1", 45);
		
		
		Flota f1=new Flota("Flota1");
		Flota f2=new Flota("Flota2");
		Flota f3=new Flota("Flota3");
		Flota fCompanie=new Flota("Flota companie");
		try {
			f1.adaugaItem(a1);
			f1.adaugaItem(a2);
			f2.adaugaItem(a3);
			f3.adaugaItem(a4);
			f3.adaugaItem(a5);
			f3.adaugaItem(a6);
			
			fCompanie.adaugaItem(f1);
			fCompanie.adaugaItem(f2);
			fCompanie.adaugaItem(f3);
			fCompanie.descriereItem();
			fCompanie.stergeItem(f2);
			f2.stergeItem(a3);
			fCompanie.descriereItem();
			System.out.println("suma "+fCompanie.calculeazaSumaGarantat(3)+" lei (3 lei pe loc)");
			System.out.println("suma "+f3.calculeazaSumaGarantat(3)+" lei (3 lei pe loc)");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
