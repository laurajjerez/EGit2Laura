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
    public int sumar(int sumar) {
        return this.valor + sumar;
    }

    public int restar(int restar) {
        return this.valor-restar;
    }

    
    public int multiplicar(int multiplicar) {
        return this.valor * multiplicar;
    }

    public int dividir(int dividir) {
        return this.valor / dividir;
    }
}
