public class Series {
    // ATRIBUTOS
    String nombre;
    String director;
    String estudio;
    String genero;
    int capitulos;
    // METODOS

    // EL PRIMER METODO QUE DEBE DE TENER TODA CLASE ES : [constructor]

    public Series(String nombre, String director, String estudio, String genero, int capitulos) {
        this.nombre = nombre;
        this.director  = director;
        this.estudio = estudio;
        this.genero = genero;
        this.capitulos = capitulos;
    }
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    // METODO IMPRIMIR SERIES

    public void imprimir_serie(){
        System.out.println("-----------------------------------");
        System.out.println("SERIES NAME: "+ getNombre());
        System.out.println("SERIES GENDER: "+getGenero());
        System.out.println("NUMBER OF CHAPTERS: "+getCapitulos());
        System.out.println("NAME OF DIRECTOR IS : "+getDirector());
        System.out.println("-----------------------------------");
    }
}
