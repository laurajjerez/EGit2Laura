package spai.egit2;

public class NumeroEntero {
    private int valor;

    public NumeroEntero(int valor) {
        this.valor = valor;
    }

    public NumeroEntero() {
        this(0);
    }

    public int getValor() {
        return valor;
    }

    private void setValor(int valor) {
        this.valor = valor;
    }

    public void incrementar() {
        this.setValor(this.valor + 1);
    }

    public void doblar() {
        this.setValor(this.valor * 2);
    }

    public void decrementar() {
        this.valor--;
    }
    
    public void sumar() {    }

	public double getSumar(int d, int e) {
			// TODO Auto-generated method stub
			return 0;
	}
	
	public void restar() {    }

	public double getRestar(int d, int e) {
			// TODO Auto-generated method stub
			return 0;
	}
	
	public void multiplicar() {    }

	public double getMultiplicar(int d, int e) {
			// TODO Auto-generated method stub
			return 0;
	}

	public void dividir() {    }

	public double getDividir(int d, int e) {
			// TODO Auto-generated method stub
			return 0;
		}
}
