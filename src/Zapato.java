public class Zapato {
    String marca;
    String color;
    int talla;
    String tipo;
    String material;

    // METODO CONSTRUCTOR

    public Zapato(String marca, String color, int talla, String tipo, String material) {
        this.marca = marca;
        this.color = color;
        this.talla = talla;
        this.tipo = tipo;
        this.material = material;
    }

    // setts

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setTalla(int talla) {
        this.talla = talla;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    // getts

    public String getMarca() {
        return marca;
    }
    public String getColor() {
        return color;
    }
    public int getTalla() {
        return talla;
    }
    public String getTipo() {
        return tipo;
    }
    public String getMaterial() {
        return material;
    }

    // METODO IMPRIMIR
    public void imprimirZapato(){
        System.out.println("-----------------------------------");
        System.out.println("[BRAND]: "+ getMarca());
        System.out.println("[COLOR]: "+ getColor());
        System.out.println("[TYPE]: " + getTipo());
        System.out.println("[TALLA]: "+ getTalla());
        System.out.println("[MATERIAL]: "+ getMaterial());
        System.out.println("-----------------------------------");
    }

}
