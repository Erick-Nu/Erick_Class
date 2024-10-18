package others;

import static java.lang.Math.*;

public class Operaciones {
    private Double n1,n2;

    public Operaciones(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operaciones() {
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    private Double getN1() {
        return n1;
    }

    private Double getN2() {
        return n2;
    }
    // METODOS PERSONALIZADOS

    public void imprimirDatos(){
        System.out.println("N1: "+ getN1());
        System.out.println("N2: "+ getN2());
    }

    // METODOS SUMAR

    public Double sumatoria(){
        return n1+n2;
    }
    public void sumaImpresion(){
        Double suma = n1 + n2;
        System.out.println("LA SUMA ES: " + suma);
    }
    public void raiz(){
        System.out.println("Raiz: " + sqrt(n1));
        System.out.println("Raiz: " + sqrt(n2));
    }

}
