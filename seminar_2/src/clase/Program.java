package clase;

import java.io.FileNotFoundException;
import java.util.List;

import clase.readers.AngajatiReader;
import clase.readers.IReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		
		try {
			IReader reader = new AngajatiReader("angajati.txt");
			listaAngajati = reader.readAplicanti();
			Aplicant.setPragPunctaj(90);
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afisareRezultat();
				angajat.afisareSumaBani(2000);
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
