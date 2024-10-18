//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            System.out.printf(" Trabajo sobre las clases en java ");
            // PARA DECLARAR EL OBJETO
            // PARA INSTANCIAR UNA CLASE
            Libro libro1 = new Libro("El Resplandor","Stephen King","De Bolsillo",600);
            Libro libro2 =  new Libro("Crónica de una muerte anunciada","Gabriel García Márquez","Random House",120);
            Libro libro3 = new Libro("El amor en los tiempos del cólera","Gabriel García Márquez","Vintage",368);
            Libro libro4 = new Libro("Rayuela","Julio Cortázar","Alfaguara",580);
            Libro libro5 = new Libro("King of Wrath","Ana Huang", "Lecturalia", 452);

            // CLASE SERIE
            Series series1 = new Series("The Office","Erick","WarnerBros","comedia",150);
            Series series2 = new Series("The BigBang T","Damian","WarnerBros","comedia",150);

            // CLASE CANCION
            Cancion cancion1 = new Cancion("Hasta Luego","Myke Towers","Black Panter","regueeton",2);
            Cancion cancion2 = new Cancion("Girls","Myke Towers","La vida es una","rap",2);

            // CLASE VIDEO JUEGOS
            VideoJuego gameOne = new VideoJuego("Call of Duty","DC","Battel Royal","Guerra - Violencia",2);
            VideoJuego gameTwo = new VideoJuego("Free Fire","Garena","Battel Royal","Guerra - Violencia",4);

            // CLASE PERSONA
            Persona personOne = new Persona("Erick","Nuñez",20,"Hombre","Desarrollador");
            Persona personTwo = new Persona("Damian","Nuñez",16,"Hombre","Estudiante");

            // CLASE AUTO
            Auto carOne = new Auto("rojo","EDF 123","Chevrolet",2024,"250");
            Auto carTwo = new Auto("azul","EGT 456","Chevrolet",2025,"10");

            // CLASE TRANSPORTE
            Transporte transportOne = new Transporte("Bus","Azul",0.35,45,"Sur - Norte");
            Transporte transportTwo = new Transporte("Taxi","Amarrillo",1.75,4,"Variable");

            // CLASE MATERIA
            Materia proffesorOne = new Materia("Quimica","Jhonny Villanueva","Simon Bolivar","2023A",2023,45);
            Materia proffesorTwo = new Materia("Fisica","Erick Nuñez","Simon Bolivar","2016B",2016,45);

            // CLASE ZAPATO
            Zapato shoeOne = new Zapato("Nike","Rojo - Negro",41,"Caña Alta","Algodon");
            Zapato shoeTwo = new Zapato("Adidas","Negro - Rojo",40,"Caña Baja","Cuero");

            // CLASE INSTRUMENTO MUSICAL
            InstrumentoMusical musicOne = new InstrumentoMusical("Flauta","Aire","Beige","FlautaBush",1980);
            InstrumentoMusical musicTwo = new InstrumentoMusical("Guitarra","Aire","Cafe","GuitarraBush",1780);

            // CLASE PELICULA
            Pelicula filmOne = new Pelicula("Game of fail","Jhonn Quenny","Terror","1:50","+18",2015);
            Pelicula filmTwo = new Pelicula("Maze Runner","Thomas Quenny","Ciencia Ficcion","2:20","+18",2020);

            // LLAMADO A LOS METODOS
            // METODOS DE LA CLASE LIBROS
            libro1.imprimir(); // METODO ONE
            libro1.imprimircubierta(); // METODO TWO
            libro2.imprimir();
            libro2.imprimircubierta();

            // METODOS DE LA CLASE SERIES
            series2.imprimir_serie();
            series2.setCapitulos(155);
            series2.imprimir_serie();

            // METODOS DE LA CLASE CANCION
            cancion2.imprimirCancion();
            cancion1.imprimirCancion();

            // METODOS DE LA CALSE VIDEO JUEGOS
            gameOne.imprimirVideoJuego();
            gameTwo.imprimirVideoJuego();

            // METODOS DE LA CLASE PERSONA
            personOne.imprimirPersona();
            personTwo.imprimirPersona();

            // METODO DE LA CLASE AUTO
            carOne.imprimirAuto();
            carTwo.imprimirAuto();

            // METODO DE LA CLASE TRANSPORTE
            transportOne.imprimirTransporte();
            transportTwo.imprimirTransporte();

            // METODO DE LA CLASE MATERIA
            proffesorOne.imprimirMateria();
            proffesorTwo.imprimirMateria();

            // METODO DE LA CLASE ZAPATO
            shoeOne.imprimirZapato();
            shoeTwo.imprimirZapato();

            // METODO DE LA CLASE INSTRUMENTO MUSICAL
            musicOne.imprimirInstrumento();
            musicTwo.imprimirInstrumento();

            // METODO PELICULA
            filmOne.imprimirPelicula();
            filmTwo.imprimirPelicula();






        }
}