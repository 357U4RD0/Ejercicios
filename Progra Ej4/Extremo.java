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

        //Lo divido por partes, para que sea más fácil de entender la operación.
        int x = (this.pases + this.asistencias - this.faltas);
        int y = (this.pases + this.asistencias + this.faltas);
        return ((x * 100 / y) + this.goles * 100 / this.lanzamientos);
    }

}