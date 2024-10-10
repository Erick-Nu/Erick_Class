public class Libro {
    //Atributos
    String titulo;
    String autor;
    String editorial;
    int paginas;
    //Metodos
    //El metodo [constructor] debe de tener todas las clases
    public Libro(String titulo, String autor, String editorial, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.paginas = paginas;
    }
    public void imprimir(){
        // Metodo Imprimir
        System.out.println("TITULO: "+this.titulo);
        System.out.println("AUTOR: "+this.autor);
        System.out.println("EDITORIAL: "+this.editorial);
        System.out.println("NUMERO DE PAGINAS: "+this.paginas);
        System.out.println("---------------------");
    }
    public int imprimircubierta(){
        return this.paginas + 5;
    }


}
