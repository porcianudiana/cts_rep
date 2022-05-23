package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sem_13.clase.CNPIncorect;
import sem_13.clase.Persoana;

public class TestGetVarsta {

	
	@Test
	public void testGetVarsta() {
		Persoana persoana = new Persoana("Ion", "6001222123456");
        assertEquals(21, persoana.getVarsta());
		
	}
	
	
    @Test
	public void testBoundaryVarstaInferior() {
		Persoana persoana=new Persoana("Ion","30001201365662");
		assertEquals(222, persoana.getVarsta());
		
	}
	
    @Test
	public void testBoundaryVarstaSuperior() {
		Persoana persoana=new Persoana("Ana","62201120136562");
		assertEquals(0, persoana.getVarsta());
		
	}
    
    @Test(expected = CNPIncorect.class)
   	public void testErrorVarsta() {
   		Persoana persoana=new Persoana("Ana","6230102136562");
   		persoana.getVarsta();
   		
   	}
    
    @Test(timeout=100)
    public void testPerformanceVarsta() {
    	Persoana persoana=new Persoana("Ana","62201120136562");
    	persoana.getVarsta();
    }
    @Test
    public void testOrder() {
    	Persoana persoana1=new Persoana("Ana","62201120136562");
    	Persoana persoana2=new Persoana("Ioan","19901120136562");

    	assertTrue(persoana1.getVarsta()<persoana2.getVarsta());
    	
    }
    
    @Test(expected =NullPointerException.class)
    public void testExistence() {
    	Persoana persoana=new Persoana("Ana",null);
    	persoana.getVarsta();
    }
}
