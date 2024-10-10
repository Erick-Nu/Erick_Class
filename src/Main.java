//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            System.out.printf("Hello and welcome!");
            // PARA DECLARAR EL OBJETO
            // PARA INSTANCIAR UNA CLASE
            Libro libro1 = new Libro("El Resplandor","Stephen King","De Bolsillo",600);
            Libro libro2 =  new Libro("Crónica de una muerte anunciada","Gabriel García Márquez","Random House",120);
            Libro libro3 = new Libro("El amor en los tiempos del cólera","Gabriel García Márquez","Vintage",368);
            Libro libro4 = new Libro("Rayuela","Julio Cortázar","Alfaguara",580);
            Libro libro5 = new Libro("King of Wrath","Ana Huang", "Lecturalia", 452);
            libro1.imprimir();
            System.out.println(libro1.imprimircubierta());
            libro2.imprimir();
            System.out.println(libro2.imprimircubierta());
            libro3.imprimir();
            System.out.println(libro3.imprimircubierta());
            libro4.imprimir();
            System.out.println(libro4.imprimircubierta());
            libro5.imprimir();
            System.out.println(libro5.imprimircubierta());
        }
}