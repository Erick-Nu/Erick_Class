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
            // CLASE SERIE
            Series series1 = new Series("The Office","Erick","WarnerBros",50);
            Series series2 = new Series("The BigBang T","Damian","WarnerBros",150);
            // CLASE CANCION
            Cancion cancion1 = new Cancion("Hasta Luego","Myke Towers","Black Panter","regueeton",2);
            Cancion cancion2 = new Cancion("Girls","Myke Towers","La vida es una","rap",2);

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
            // Metodos de la clase series
            System.out.printf(series2.getGenero());
        }
}