// A partir del siguiente código, identifica y aplica las refactorizaciones que consideres más convenientes.
// Implementa el proyecto en IntelliJ y documenta los cambios realizados. 
// Sube los cambios a github y envíame enlace para que pueda evaluar el ejercicio

public class Persona {
    protected String numeroDeTelefono;
    public Persona(String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNumeroDeTelefono() {

        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {

        this.numeroDeTelefono = numeroDeTelefono;
    }
}
