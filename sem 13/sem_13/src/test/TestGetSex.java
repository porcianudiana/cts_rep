package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sem_13.clase.CNPIncorect;
import sem_13.clase.Persoana;

public class TestGetSex {

	@Test
	public void testCorectSexM() {
		Persoana persoana=new Persoana("Ion","155363662253");
		assertEquals("M", persoana.getSex());
		
	}
	
	@Test
	public void testCorectSexF() {
		Persoana persoana=new Persoana("Maria","253650662253");
		assertEquals("F", persoana.getSex());
		
	}

	
	@Test
	public void testBoundarySexInferior() {
		Persoana persoana=new Persoana("Ion","1000101365662");
		assertEquals("M", persoana.getSex());
		
	}
	
	@Test
	public void testBoundarySexSuperior() {
		Persoana persoana=new Persoana("Maria","6220101365662");
		assertEquals("F", persoana.getSex());
		
	}
	
	@Test
	public void testCrossCheckSex() {
		Persoana persoana = new Persoana("Ana", "52201012123565");
        int cifra = persoana.CNP.charAt(0);
        assertEquals(cifra % 2 != 0 ? "M" : "F", persoana.getSex());
	}
	
	@Test(expected = CNPIncorect.class)
    public void testErrorSex() {
        Persoana persoana = new Persoana("Ana", "02201012123565");
        persoana.getSex();
    }
	
	
	@Test(timeout = 100)
	public void testPerformanceSex() {
		Persoana persoana=new Persoana("Maria","6220101365662");
		persoana.getSex();
	}
	
	
	@Test
	public void testFormatSex() {
		Persoana persoana=new Persoana("Maria","6220101365662");
		assertEquals(1, persoana.getSex().length());
	}
	
	@Test(expected = NullPointerException.class)
	public void testExistenceSex() {
	
		Persoana persoana=new Persoana("Maria",null);
		persoana.getSex();
		
	}
	
	
	
}
