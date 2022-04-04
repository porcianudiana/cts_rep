package main;


import clase.Autobuz;
import clase.AutobuzBuilder;

public class Program {

public static void main(String[] args) {
	AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
	autobuzBuilder.setNumeSoferString("Dorel").setDeschideUsi(false);
	Autobuz autobuz=autobuzBuilder.build();
	Autobuz autobuz2=new AutobuzBuilder().setNumeSoferString("Ion").setNrLinie(3).build();
	
	
	
	System.out.println(autobuz.toString());
	System.out.println(autobuz2.toString());
	
	AutobuzBuilder builder=new AutobuzBuilder();
	builder.setTextRulatString("La multi ani!").setOraIncepereProgram(9);
	Autobuz a1=builder.build();
	
	Autobuz autobuz3=builder.build();
	
	
}
}
