public class Series {
    //Atributos
    String nombre;
    String director;
    String estudio;
    String genero;
    int capitulos;
    //Metodos
    //El metodo [constructor] debe de tener todas las clases
    public Series(String nombre, String director, String estudio, int capitulos) {
        this.nombre = nombre;
        this.director = director;
        this.estudio = estudio;
        this.genero = genero;
        this.capitulos = capitulos;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDirector() {
        return director;
    }
    public String getEstudio() {
        return estudio;
    }
    public String getGenero() {
        return genero;
    }
    public int getCapitulos() {
        return capitulos;
    }
}
