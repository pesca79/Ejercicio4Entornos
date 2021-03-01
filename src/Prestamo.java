import java.time.LocalDate;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

// A partir del siguiente código, identifica y aplica las refactorizaciones que consideres más convenientes.
// Implementa el proyecto en IntelliJ y documenta los cambios realizados. 
// Sube los cambios a github y envíame enlace para que pueda evaluar el ejercicio
public class Prestamo extends Persona{
    protected String nombre;
    protected int edad;
    protected int numeroDePrestamo;
    protected LocalDate fechaPrestamo;
    protected LocalDate fechaDevolucion;
    protected List<Prestamo> prestamos;
    public Prestamo(int numP, String numeroDeTelefono, String nombre, int edad, LocalDate fechaP, LocalDate fechaDev){
        super(numeroDeTelefono);
        this.nombre = nombre;
        this.numeroDePrestamo = numP;
        this.edad = edad;
        this.fechaPrestamo = fechaP;
        this.fechaDevolucion = fechaDev;
    }

    @Override
    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    @Override
    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = getNombre();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroDePrestamo() {
        return numeroDePrestamo;
    }

    public void setNumeroDePrestamo(int numeroDePrestamo) {
        this.numeroDePrestamo = numeroDePrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
            this.fechaPrestamo = fechaPrestamo;
    }
    public String getFechaDevolucion() {
        return fechaDevolucion.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
            this.fechaDevolucion = fechaDevolucion;

    }

    @Override
    public String toString() {
        return "\nPrestamo: nº"+ getNumeroDePrestamo() +":\n______________"+
                "\nNúmero de telefono: \"" + getNumeroDeTelefono() +"\"" +
                "\nNombre= \"" + getNombre() +"\" "+esProfesor()+
                "\nEdad= \"" + getEdad() +"\""+
                "\nFecha del préstamo= "+"\""+getFechaPrestamo()+"\"" +
                "\nFecha de devolución="+"\""+fechaNula()+"\"\n";
    }
    public String fechaNula() {
        if (fechaDevolucion==null){
            return "Aún no se ha devuelto";
        }
        return  getFechaDevolucion();
    }
    public String esProfesor() {
        if (prestamos instanceof Profesor){
            return "\"Es un profesor!\"";
        }
        return "";
    }
    public static void main(String[] args) {
        Prestamo[] prestamos = new Prestamo[4];
        prestamos[0] = new Prestamo(1,"686359874","José Pérez",25,LocalDate.of(2020, 2, 20),LocalDate.of(2020, 8, 20));
        prestamos[1] = new Prestamo(2,"612598401","Juan Vidal",30,LocalDate.of(2020,8,18),LocalDate.of(2020,11,22));
        prestamos[2] = new Prestamo(3,"620358974","Jose Revilla",29,LocalDate.of(2020,11,23),null);
        prestamos[3] =new Prestamo(4,"600235874","Ana Rojas",48,LocalDate.of(2020,12,22),LocalDate.of(2021,1,23));
        for (Prestamo p : prestamos){
            System.out.println(p.toString());
        }
    }
}
