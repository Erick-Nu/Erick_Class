package Musica;

public class InstrumentoMusical {
    String nameInstrument;
    String typeInstrument;
    String colorInstrument;
    String marca;
    int yearInstrument;
    // METODO CONSTRUCTOR

    public InstrumentoMusical(String nameInstrument, String typeInstrument, String colorInstrument, String marca, int yearInstrument) {
        this.nameInstrument = nameInstrument;
        this.typeInstrument = typeInstrument;
        this.colorInstrument = colorInstrument;
        this.marca = marca;
        this.yearInstrument = yearInstrument;
    }

    // setts

    public void setNameInstrument(String nameInstrument) {
        this.nameInstrument = nameInstrument;
    }
    public void setTypeInstrument(String typeInstrument) {
        this.typeInstrument = typeInstrument;
    }
    public void setColorInstrument(String colorInstrument) {
        this.colorInstrument = colorInstrument;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setYearInstrument(int yearInstrument) {
        this.yearInstrument = yearInstrument;
    }

    // getts

    public String getNameInstrument() {
        return nameInstrument;
    }
    public String getTypeInstrument() {
        return typeInstrument;
    }
    public String getColorInstrument() {
        return colorInstrument;
    }
    public String getMarca() {
        return marca;
    }
    public int getYearInstrument() {
        return yearInstrument;
    }

    // METODO IMPRIMIR
    public void imprimirInstrumento(){
        System.out.println("-----------------------------------");
        System.out.println("[NAME INSTRUMENT]: "+ getNameInstrument());
        System.out.println("[TYPE INSTRUMENT]: "+ getTypeInstrument());
        System.out.println("[COLOR INSTRUMENT]: " + getColorInstrument());
        System.out.println("[MARCA]: "+ getMarca());
        System.out.println("[YEAR OF CREATION OF THE INSTRUMENT]: "+ getYearInstrument());
        System.out.println("-----------------------------------");
    }
}
