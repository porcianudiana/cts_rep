package teste;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import clase.Matematica;

public class MatematicaTests {
	
	
	private Matematica mate;
	
	@Before
	public void setUp() {
		mate=Matematica.getInstance();
	}

	@Test
	public void testSumaCorecta() {
		
		int rezultat=mate.suma(7, 5);
		assertEquals(12, rezultat);
	}

	
	@Test
	public void testRaport() {
		
		double rezultat=mate.raport(24, 6);
		assertEquals(4, rezultat,0.0001);
	}
	
	
	@Test
	public void testRaport2() {
		
		double rezultat=mate.raport(24, 11);
		assertEquals(2.18, rezultat,0.005);
		
	}
	
	
	@Test
	public void testRaport3() {
		
		double rezultat=mate.raport(24, -2);
		assertEquals(-12, rezultat,0.005);
	}
	
	@Test
	public void testRaportShouldThrowexception() {
		try {
			
			mate.raport(57, 0);
			fail("nu trebuia sa ajunga aici");
			
		} catch (IllegalArgumentException ert) {
			
		}
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void TestRaportShoulThrowexception() {
		mate.raport(23,0);
	}
	
	@Test
	public void testParitate() {
		boolean rezultat=mate.estePar(5);
		assertFalse(rezultat);
		
		assertTrue(mate.estePar(4));
		assertTrue(mate.estePar(4));
		assertFalse(mate.estePar(9));
	
	}
	
	@Test
	public void testNumerePare() {
	
		assertEquals(4, mate.nNumerePare(4).size());
		assertEquals(5, mate.nNumerePare(5).size());
		assertEquals(1, mate.nNumerePare(1).size());
	}
	
	
	@Test
	public void testNumerePare2() {
	
		assertNull(mate.nNumerePare(0));

	}
	
	@Test(expected =IllegalArgumentException.class )
	public void testIllegalArgumentException() {
	
		mate.nNumerePare(-3);

	}
	
	@Test
	public void testSingleton() {
		assertSame(Matematica.getInstance(), Matematica.getInstance());
	}
	
	@Test
	public void testRaport5() {
		assertEquals(1, mate.raport(5, 5),0.005);
	}
}
