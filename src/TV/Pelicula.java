package TV;

public class Pelicula {
    String titulo;
    String autor;
    String genero;
    String duracion;
    String categoria;
    int yearPublished;

    // METODO CONSTRUCTOR


    public Pelicula(String titulo, String autor, String genero, String duracion, String categoria, int yearPublished) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.duracion = duracion;
        this.categoria = categoria;
        this.yearPublished = yearPublished;
    }
    // METODO CONSTRUCTOR VACIO
    public Pelicula() {
    }
    // setts

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    // getts

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getGenero() {
        return genero;
    }
    public String getDuracion() {
        return duracion;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getYearPublished() {
        return yearPublished;
    }

    // METODO IMPRIMIR

    public void imprimirPelicula(){
        System.out.println("-----------------------------------");
        System.out.println("[TITLE]: "+ getTitulo());
        System.out.println("[AUTOR]: "+ getAutor());
        System.out.println("[GENRE]: " + getGenero());
        System.out.println("[DURACION]: "+ getDuracion());
        System.out.println("[CATEGORY]: "+ getCategoria());
        System.out.println("[YEAR PUBLISHED]: "+ getYearPublished());
        System.out.println("-----------------------------------");
    }

    // METODO PUBLICO
    public void metodo1(){

    }
    //  METODO PRIVADO
    private void metodo2(){

    }
}
