public class Libro extends Articulo {

    String Editorial;

    public Libro(int ID, String Titulo, String Autor, String Materia, int Ejemplares, boolean Reserva, String Editorial){
        super(ID, Titulo, Autor, Materia, Ejemplares, Reserva);
        this.Editorial = Editorial;
    }

}
