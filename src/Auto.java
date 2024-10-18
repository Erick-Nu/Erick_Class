public class Auto {
    String color;
    String placa;
    String marca;
    int year;
    String kilometraje;
     // METODO CONSTRCUTOR
    public Auto(String color, String placa, String marca, int year, String kilometraje) {
        this.color = color;
        this.placa = placa;
        this.marca = marca;
        this.year = year;
        this.kilometraje = kilometraje;
    }
    // setts

    public void setColor(String color) {
        this.color = color;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    // getts

    public String getColor() {
        return color;
    }
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public int getYear() {
        return year;
    }
    public String getKilometraje() {
        return kilometraje;
    }

    // METODO IMPRIMIR
    public void imprimirAuto(){
        System.out.println("-----------------------------------");
        System.out.println("[BRAND]: "+ getMarca());
        System.out.println("[COLOR]: "+ getColor());
        System.out.println("[PLACA]: "+ getPlaca());
        System.out.println("[YEAR]: "+getYear());
        System.out.println("[KILOMETRAJE]: "+getKilometraje());
        System.out.println("-----------------------------------");
    }
}
