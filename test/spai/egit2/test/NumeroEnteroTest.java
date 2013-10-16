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
    
//    public int restar(int resultado){...} 
//    public int multiplicar(int resultado){...}  
//    public int dividir(int resultado){...} 
    
    @Test
    public void testSumar(){
    	numero = new NumeroEntero(10);
    	assertEquals(12, numero.sumar(2));
    }
    
    @Test
    public void testRestar(){
    	numero = new NumeroEntero(8);
    	assertEquals(5, numero.restar(3));
    }
    
    @Test
    public void testMultiplicar(){
    	numero = new NumeroEntero(8);
    	assertEquals(16, numero.multiplicar(2));
    }
    
    @Test
    public void testDividir(){
    	numero = new NumeroEntero(20);
    	assertEquals(10, numero.dividir(2));
    }
}
