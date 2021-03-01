// A partir del siguiente c�digo, identifica y aplica las refactorizaciones que consideres m�s convenientes.
// Implementa el proyecto en IntelliJ y documenta los cambios realizados. 
// Sube los cambios a github y env�ame enlace para que pueda evaluar el ejercicio
import java.util.List;

public class Profesor extends Persona{
    // RenombrAado a nombre, que es más descriptivo
    protected String nombre;
    protected int edad;
    protected List<Prestamo> prestamos;

    public Profesor(String numeroDeTelefono, String nombre) {
        super(numeroDeTelefono);
        this.nombre=nombre;
    }

    public void printInformacionPersonal(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);
    }

    public void printTodaLaInformacion(){
        // Refactorizado, tiene código duplicado. Se llamará al método printInformacionPersonal()
        this.printInformacionPersonal();
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }
}
