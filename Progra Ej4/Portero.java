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
        //Esto solo para que me deje hacer mi commit.
        int x= 2 ;
        return x;
    }
}
