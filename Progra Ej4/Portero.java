//decidí mejor hacer una clase para portero, y otra para extremo, con sus respectivas operaciones

public class Portero extends Jugador {

    private int paradas;
    private int goles_rec;

    public Portero(String nombre, String pais, int faltas, int goles, int lanzamientos, int paradas, int goles_rec){
        super(nombre, pais, faltas, goles, lanzamientos);
        this.paradas = paradas;
        this.goles_rec = goles_rec;
    }

    public int getPases(){
        return this.paradas;
    }

    public int getGoles_rec(){
        return this.goles_rec;
    }

    public float EfecPor(){

        //Lo divido por partes, para que sea más fácil de entender la operación.
        int x = (this.paradas - this.goles_rec);
        int y = (this.paradas + this.goles_rec);
        return ((x * 100 / y) + this.goles * 100 / this.lanzamientos);
    }
}
