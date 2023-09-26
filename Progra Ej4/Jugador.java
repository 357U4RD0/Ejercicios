//En esta clase es donde estaré creando el "cuerpo" de los jugadores.

//En el análisis y diseño puse sin querer los datos exclusivos de los porteros y extremos. 
//En realidad los quería poner en sus respectivas clases.

public class Jugador {

    //Todos los valores de cada jugador, sin importar la posición.
    protected String nombre;
    protected String pais;
    protected int faltas;
    protected int goles;
    protected int lanzamientos;

    public Jugador(String nombre, String pais, int faltas, int goles, int lanzamientos){
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.goles = goles;
        this.lanzamientos = lanzamientos;
    }

    public int getGoles(){
        return this.goles;
    }

    public int getFaltas(){
        return this.faltas;
    }

    public String getNombre(){
        return this.nombre;
    }
}
