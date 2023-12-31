public class Articulo {

    //Se suponía que Libro sería la clase padre, 
    //pero Artículo al tener todos los datos que usaría Libro y revista
    //decidí hacer que este sea el padre.

    //Aquí debería de haber incluido al "árbitro", 
    //pero aparte que no sé a lo que se refiere, Erick dijo que no lo pongamos.
    protected int ID;
    protected String Titulo;
    protected String Autor;
    protected String Materia;
    protected int Ejemplares;
    protected boolean Reserva;

    public Articulo(int ID, String Titulo, String Autor, String Materia, int Ejemplares, boolean Reserva){
        this.ID = ID;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Materia = Materia;
        this.Ejemplares = Ejemplares;
        this.Reserva = Reserva;
    }

    public String getTitulo(){
        return this.Titulo;
    }

    public String getAutor(){
        return this.Autor;
    }

    public String getMateria(){
        return this.Materia;
    }

    public int getID(){
        return this.ID;
    }
}