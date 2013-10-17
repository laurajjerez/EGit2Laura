package spai.egit2.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import spai.egit2.NumeroEntero;

public class NumeroEnteroTest {
    private NumeroEntero numero;

    @Before
    public void initObjects() {
        this.numero = new NumeroEntero(100);
    }

    @Test
    public void testConstructorSinParametros() {
        NumeroEntero numero = new NumeroEntero();
        assertEquals(0, numero.getValor());
    }
    
    @Test
    public void testConstructorConParametros() {
        NumeroEntero numero = new NumeroEntero(-10);
        assertEquals(-10, numero.getValor());
    }

    @Test
    public void testIncrementar() {
        this.numero.incrementar();
        assertEquals(101, this.numero.getValor());
    }

    @Test
    public void testDoblar() {
        this.numero.doblar();
        assertEquals(200, this.numero.getValor());
    }

    @Test
    public void testDecrementar() {
        this.numero.decrementar();
        assertEquals(99, numero.getValor());
        numero = new NumeroEntero();
        this.numero.decrementar();
        assertEquals(-1, numero.getValor());
    }
    
    
    @Test
    public void testSumar() {
    	assertEquals(4, numero.getSumar(5, 1), 1e-6);
    	}   
    

    @Test
    public void testRestar() {
    assertEquals(4, numero.getRestar(5, 1), 1e-6);
    }    
    
    @Test
    public void testMultiplicar() {
    assertEquals(5, numero.getMultiplicar(5, 1), 1e-6);
    }
    
    @Test
    public void testDividir() {
    assertEquals(2, numero.getDividir(4, 2), 1e-6);
    }
}
