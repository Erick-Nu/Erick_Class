package others;

public class Libro {
    // DECLARACION DE LOS ATRIBUTOS QUE VA A TENER LA CLASE
    String titulo;
    String autor;
    String editorial;
    int paginas;

    // METODOS

    // EL PRIMER METODO QUE DEBE DE TENER TODA CLASE ES : [constructor]
    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }
    public void imprimir(){
        // METODO IMPRIMIR
        System.out.println("---------------------");
        System.out.println("TITULO: "+this.titulo);
        System.out.println("AUTOR: "+this.autor);
        System.out.println("EDITORIAL: "+this.editorial);
        System.out.println("NUMERO DE PAGINAS: "+this.paginas);
        System.out.println("---------------------");
    }
       // METODO IMPRIMIR NUMERO DE PAGINAS  + 5
    public void imprimircubierta(){
        int number_page;
        number_page = this.paginas + 5;
        System.out.println("EL NUMERO DE PAGINAS ES: "+ number_page);
    }
}
