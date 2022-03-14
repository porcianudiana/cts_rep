package clase.readers;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


import clase.Angajat;
import clase.Aplicant;


public class AngajatiReader extends IReader{

	public AngajatiReader(String numeFisier) throws FileNotFoundException {
		super(numeFisier);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti(){
		scanner.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Angajat angajat = new Angajat();
			super.citireAplicant(scanner, angajat);
			int salariu = scanner.nextInt();
			String ocupatie = scanner.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		scanner.close();
		return angajati;
	}

}
