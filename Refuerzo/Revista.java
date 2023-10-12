public class Revista extends Articulo {
    
    int año;
    int numero;

    public Revista(int ID, String Titulo, String Editorial, String Materia, int Ejemplares, boolean Reserva, int año, int numero){
        super(ID, Titulo, Editorial, Materia, Ejemplares, Reserva);
        this.año = año;
        this.numero = numero;
    }

}
