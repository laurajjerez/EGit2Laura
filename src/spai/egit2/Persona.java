package spai.egit2;

public class Persona {
    private String nombre;

    private String apellido;
    private String segundoApellido;

    private String format(String cadena) {
        cadena = cadena.trim();
        return cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase();
    }

    public Persona(String nombre, String apellido,  String segundoApellido) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setSegundoApellido(segundoApellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = this.format(nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = this.format(apellido);
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = this.format(segundoApellido);
    }
    
    public String nombreCompleto() {
        return this.nombre + " " + this.apellido + " " + this.segundoApellido;
    }

    public String inicial() {
        return this.nombre.substring(0, 1) + ".";
    }

	 

}
