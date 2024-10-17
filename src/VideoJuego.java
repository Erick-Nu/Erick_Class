public class VideoJuego {
    // ATRIBUTOS
    String nombre;
    String propietario;
    String modo;
    String genero;
    int actualizaciones;
    // METODOS
    // EL PRIMER METODO QUE DEBE DE TENER TODA CLASE ES : [constructor]

    public VideoJuego(String nombre, String propietario, String modo, String genero, int actualizaciones) {
        this.nombre = nombre;
        this.propietario = propietario;
        this.modo = modo;
        this.genero = genero;
        this.actualizaciones = actualizaciones;
    }
}
