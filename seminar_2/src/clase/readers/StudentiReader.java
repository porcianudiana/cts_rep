package clase.readers;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


import clase.Aplicant;
import clase.Student;

public class StudentiReader extends IReader {

	public StudentiReader(String numeFisier) throws FileNotFoundException {
		super(numeFisier);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti() {
		
		super.scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<>();

		while (scanner.hasNext()) {
			Student student = new Student();
			super.citireAplicant(scanner, student);
			int anStudii = scanner.nextInt();
			String facultate = scanner.next();
			student.setAnStudii(anStudii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		scanner.close();
		return studenti;
	}

}
