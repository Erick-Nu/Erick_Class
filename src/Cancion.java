public class Cancion {
    // ATRIBUTOS
    String nombre;
    String sing;
    String album;
    String genero;
    int duracion;
    // METODOS
    // METODO CONSTRUCTOR
    public Cancion(String nombre, String sing, String album, String genero, int duracion) {
        this.nombre = nombre;
        this.sing = sing;
        this.album = album;
        this.genero = genero;
        this.duracion = duracion;
    }
    // setts
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSong(String sing) {
        this.sing = sing;

    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    // getts
    public String getNombre() {
        return nombre;
    }
    public String getSing() {
        return sing;
    }
    public String getAlbum() {
        return album;

    }
    public String getGenero() {

        return genero;
    }
    public int getDuracion() {

        return duracion;
    }


    // METODO IMPRIMIR
    public void imprimirCancion(){
        System.out.println("-----------------------------------");
        System.out.println("[NAME OF MUSIC]: "+getNombre());
        System.out.println("[ARTIST NAME]: "+getSing());
        System.out.println("[ALBUM NAME]: "+getAlbum());
        System.out.println("[DURATION]: "+getDuracion());
        System.out.println("[MUSICAL GENRE]: "+getGenero());
        System.out.println("-----------------------------------");
    }
}
