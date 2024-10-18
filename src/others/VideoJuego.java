package others;

public class VideoJuego {
    // ATRIBUTOS
    String nameOfVideoGame;
    String propietario;
    String modo;
    String genero;
    int actualizaciones;
    // METODOS

    // EL PRIMER METODO QUE DEBE DE TENER TODA CLASE ES : [constructor]
    public VideoJuego(String nameOfVideoGame, String propietario, String modo, String genero, int actualizaciones) {
        this.nameOfVideoGame = nameOfVideoGame;
        this.propietario = propietario;
        this.modo = modo;
        this.genero = genero;
        this.actualizaciones = actualizaciones;
    }
    // setts
    public void setNameOfVideoGame(String nameOfVideoGame) {
        this.nameOfVideoGame = nameOfVideoGame;
    }
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    public void setModo(String modo) {
        this.modo = modo;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setActualizaciones(int actualizaciones) {
        this.actualizaciones = actualizaciones;
    }
    //getts

    public String getNameOfVideoGame() {
        return nameOfVideoGame;
    }
    public String getPropietario() {
        return propietario;
    }
    public String getModo() {
        return modo;
    }
    public String getGenero() {
        return genero;
    }
    public int getActualizaciones() {
        return actualizaciones;
    }
    // METODO IMPRIMIR CLASE VIDEO JUEGO
    public void imprimirVideoJuego(){
        System.out.println("-----------------------------------");
        System.out.println("[NAME OF VIDEO GAMES]: "+ getNameOfVideoGame());
        System.out.println("[OWNER]: "+getPropietario());
        System.out.println("[MODE]: "+getModo());
        System.out.println("[UPDATE]: "+getActualizaciones());
        System.out.println("[VIDEO GAMES GENRE]: "+getGenero());
        System.out.println("-----------------------------------");
    }
}
