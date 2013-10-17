package spai.egit2;

import java.util.ArrayList;
import java.util.List;

public class ColeccionDecimales {
	private List<Double> coleccion;

	public ColeccionDecimales(double[] coleccion) {
		this.coleccion = new ArrayList<Double>();
		for (double item : coleccion) {
			this.coleccion.add(item);
		}
	}

	public ColeccionDecimales() {
		this(new double[0]);
	}

	public Double suma() {
		double suma = 0;
		for (double item : this.coleccion) {
			suma += item;
		}
		return suma;
	}

	public double mayor() {
		double mayor = Double.NEGATIVE_INFINITY;
		for (double item : this.coleccion) {
			if (item > mayor)
				mayor = item;
		}
		return mayor;
	}

	public double restar() {
		double restar = this.coleccion.get(0);
		this.coleccion.remove(0);
		for (double item : this.coleccion) {
			restar -= item;
		}
		return restar;
	}

	public double multiplicar() {
		
		double mult = this.coleccion.get(0);
		this.coleccion.remove(0);
		for (double item : this.coleccion) {
			mult *= item;
		}
		return mult;
	}

	public int tamano() {
		return this.coleccion.size();
	}

	public double media() {
		return this.suma()/this.coleccion.size();
	}

}
