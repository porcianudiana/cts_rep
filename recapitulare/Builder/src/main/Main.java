package main;

import clase.Autobuz;
import clase.AutobuzBuilder;

public class Main {

	public static void main(String[] args) {

AutobuzBuilder autobuzBuilder=new AutobuzBuilder();
autobuzBuilder.setNumeString("Dana").setDeschideUsi(false);
Autobuz autobuz=autobuzBuilder.build();
Autobuz autobuz2=new AutobuzBuilder().setNumeString("Ion").setNrLinie(3).build();

System.out.println(autobuz.toString());
System.out.println(autobuz2.toString());


AutobuzBuilder builder=new AutobuzBuilder();
builder.setTextRulatString("Bafta frate").setOraIncepereProgram(10);
Autobuz a1=builder.build();

Autobuz autobuz3=builder.build();
	}

}
