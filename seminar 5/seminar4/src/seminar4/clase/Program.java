package seminar4.clase;

public class Program {

	
	public static void main(String[] args) throws CloneNotSupportedException{
		Autobuz autobuz=new Autobuz("Vasile");
		Tramvai tramvai=new Tramvai("Gigel");
		
		Autobuz a1=(Autobuz) autobuz.copiaza();
		Tramvai t1=(Tramvai) tramvai.copiaza();
		
		System.out.println(autobuz.toString());
		System.out.println(a1.toString());
		System.out.println(tramvai.toString());
		System.out.println(t1.toString());
	}
}
