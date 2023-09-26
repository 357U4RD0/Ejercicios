public class Extremo extends Jugador {

    private int pases;
    private int asistencias;

    public Extremo(String nombre, String pais, int faltas, int goles, int lanzamientos, int pases, int asistencias){
        super(nombre, pais, faltas, goles, lanzamientos);
        this.pases = pases;
        this.asistencias = asistencias;
    }

    public int getPases(){
        return this.pases;
    }

    public int getAsistencias(){
        return this.asistencias;
    }

    public float EfecExt(){
        //Esto solo para que me deje hacer mi commit.
        int x= 2 ;
        return x;
    }

}