import java.util.Scanner;
public class Calculadora {
    int numberOne;
    int numberTwo;

    public Calculadora() {
    }

    public Calculadora(int numberOne, int numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    // METODO SUMA
    private void suma(){
        int valorSuma = numberOne + numberTwo;
        System.out.println("LA SUMA ES: " + valorSuma);
    }
    // METODO RESTA
    private void resta(){
        int valorResta = numberOne - numberTwo;
        System.out.println("LA RESTA ES: " + valorResta);
    }
    private void division(){
        int valorDivision = numberOne / numberTwo;
        if (numberTwo == 0){
            System.out.println("LA DIVISION PARA CERO NO ESTA DEFINIDA");
        }
        else {
            System.out.println("LA DIVISION ES: " + valorDivision);
        }
    }
    private void multiplicacion(){
        int valorMultiplicacion = numberOne * numberTwo;
        System.out.println("LA MULTIPLICACION ES: " + valorMultiplicacion);
    }

}
