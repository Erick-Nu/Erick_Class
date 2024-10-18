package others;

public class Materia {
    String name;
    String professor;
    String colegio;
    String periodo;
    int year;
    int numberStudent;

    // METODO CONSTRUCTOR

    public Materia(String name, String professor, String colegio, String periodo, int year, int numberStudent) {
        this.name = name;
        this.professor = professor;
        this.colegio = colegio;
        this.periodo = periodo;
        this.year = year;
        this.numberStudent = numberStudent;
    }

    // setts

    public void setName(String name) {
        this.name = name;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }
    public void setColegrio(String colegrio) {
        this.colegio = colegio;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    // getts


    public String getName() {
        return name;
    }
    public String getProfessor() {
        return professor;
    }
    public String getColegio() {
        return colegio;
    }
    public String getPeriodo() {
        return periodo;
    }
    public int getYear() {
        return year;
    }
    public int getNumberStudent() {
        return numberStudent;
    }

    // METODO IMPRIMIR

    public void imprimirMateria(){
        System.out.println("-----------------------------------");
        System.out.println("[MATERIA]: "+ getName());
        System.out.println("[PROFESSOR]: "+ getProfessor());
        System.out.println("[COLEGIO]: "+ getColegio());
        System.out.println("[PERIODO]: "+getPeriodo());
        System.out.println("[YEAR]: "+ getYear());
        System.out.println("[NUMBER STUDENT]: "+ getNumberStudent());
        System.out.println("-----------------------------------");
    }
}
