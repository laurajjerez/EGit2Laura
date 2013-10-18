package spai.egit2;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el
 * denominador
 * 
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el
 * denominador
 * 
 * Dos fracciones son equivalentes cuando el producto de extremos es igual al
 * producto de medios
 * 
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto
 * sucede cuando el numerador y el denominador son primos entre s�
 * 
 * Reducir varias fracciones a com�n denominador consiste en convertirlas en
 * otras equivalentes que tengan el mismo denominador
 * 
 * Comparar fracciones
 * 
 * Suma fracciones: En primer lugar se reducen los denominadores a com�n
 * denominador, y se suman o se restan los numeradores de las fracciones
 * equivalentes obtenidas
 * 
 * Multiplicaci�n: La multiplicaci�n de dos fracciones es otra fracci�n que
 * tiene: Por numerador el producto de los numeradores. Por denominador el
 * producto de los denominadores.
 * 
 * La divisi�n de dos fracciones es otra fracci�n que tiene: Por numerador el
 * producto de los extremos. Por denominador el producto de los medios. Invertir
 * fraccion
 * 
 * @author jbernal
 * 
 */
public class Fraccion {
	private int numerador;

	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
	}

	public Fraccion() {
		this(1, 1);
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	public double decimal() {
		return (double) numerador / denominador;
	}

	public boolean isPropia() {
		boolean propia = false;
		if (this.denominador > this.numerador) {
			propia = true;
		}
		return propia;
	}

	public boolean isImpropia() {
		boolean impropia = false;
		if (this.denominador < this.numerador) {
			impropia = true;
		}
		return impropia;
	}

	public Fraccion sumar(Fraccion fraccion) {
		this.numerador = (this.numerador * fraccion.denominador)
				+ (this.denominador * fraccion.numerador);
		this.denominador = this.denominador * fraccion.denominador;
		return this;
	}

	public Fraccion restar(Fraccion fraccion) {
		this.numerador = (this.numerador * fraccion.denominador)
				- (this.denominador * fraccion.numerador);
		this.denominador = this.denominador * fraccion.denominador;
		return this;
	}

	public boolean mayor(Fraccion fraccion) {
		return ((double) this.numerador / (double) this.denominador) < ((double) fraccion.numerador / (double) fraccion.denominador);
	}

	public boolean menor(Fraccion fraccion) {
		return ((double) this.numerador / (double) this.denominador) > ((double) fraccion.numerador / (double) fraccion.denominador);
	}

}
