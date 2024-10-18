package TV;

public class Persona {
    String nombre;
    String apellido;
    int edad;
    String genero;
    String profecion;

    // METODO CONSTRUCTOR
    public Persona(String nombre, String apellido, int edad, String genero, String profecion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.profecion = profecion;
    }

    // setts
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setProfecion(String profecion) {
        this.profecion = profecion;
    }

    // getts

    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }
    public String getGenero() {
        return genero;
    }
    public String getProfecion() {
        return profecion;
    }
    // METODO IMPRIMIR
    public void imprimirPersona(){
        System.out.println("-----------------------------------");
        System.out.println("[FULL NAME]: "+ getNombre()+" "+ getApellido());
        System.out.println("[AGE]: "+ getEdad() + "años");
        System.out.println("[GENRE]: "+ getGenero());
        System.out.println("[POFESSION]: "+getProfecion());
        System.out.println("-----------------------------------");
    }
}
