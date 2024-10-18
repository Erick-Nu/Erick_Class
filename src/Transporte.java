public class Transporte {
    String tipo;
    String color;
    Double valorPasaje;
    int numeroAsientos;
    String ruta;
    // METODO CONSTRUCTOR
    public Transporte(String tipo, String color, Double valorPasaje, int numeroAsientos, String ruta) {
        this.tipo = tipo;
        this.color = color;
        this.valorPasaje = valorPasaje;
        this.numeroAsientos = numeroAsientos;
        this.ruta = ruta;
    }

    // setts

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setValorPasaje(Double valorPasaje) {
        this.valorPasaje = valorPasaje;
    }
    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    // getts


    public String getTipo() {
        return tipo;
    }
    public String getColor() {
        return color;
    }
    public Double getValorPasaje() {
        return valorPasaje;
    }
    public int getNumeroAsientos() {
        return numeroAsientos;
    }
    public String getRuta() {
        return ruta;
    }

    // METODO IMRPRIMIR
    public void imprimirTransporte(){
        System.out.println("-----------------------------------");
        System.out.println("[TYPE]: "+ getTipo());
        System.out.println("[COLOR]: "+ getColor());
        System.out.println("[VALOR DEL PASAJE]: "+ getValorPasaje());
        System.out.println("[NUMBER OF SEATS ]: "+getNumeroAsientos());
        System.out.println("[RUTA]: "+ getRuta());
        System.out.println("-----------------------------------");
    }
}
