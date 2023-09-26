//Estuardo Castro 23890
//Ejercicio #4 
//En este programa, se analizarán los datos de los jugadores de balonmano, dando ciertas estadísticas.

//En el análisis y diseño agregué en cada clase los arraylists para guardar los nombres de los jugadores.
//Pero pensé que sería mejor idea guardar en el main esos Arrays.

import java.util.ArrayList;

public class Balonmano {

    public static void main(String[] args) {
        System.out.println("hola");
        ArrayList<Jugador> Nombres = new ArrayList<Jugador>();
        ArrayList<Extremo> Extremos = new ArrayList<Extremo>();
        ArrayList<Portero> Porteros = new ArrayList<Portero>();

        //Los jugadores que usaré son reales (Cabe mencionar que son de fut)
        //Los tiros los inventaré, multiplicaré x1.5 los goles
        //Las faltas y pases los inventaré
        //Las paradas de los porteros, multiplicaré por 3.5 las veces que dejó en blanco su portería.
        Jugador Maldini = new Jugador("Maldini", "Italia", 90, 33, 50);
        Extremo Messi = new Extremo("Messi", "Argentina", 150, 819, 1229, 23000, 362);
        Portero Cech = new Portero("Petr Cech", "República Checa", 3, 0, 1, 1194, 695);

        // Pruebas
        // System.out.println(Messi.EfecExt());
        // System.out.println(Cech.EfecPor());
        // System.out.println(Maldini.lanzamientos);

        //Agregar los jugadores a los arrays
        Nombres.add(Maldini);
        Extremos.add(Messi);
        Porteros.add(Cech);

        //Prueba
        for (Jugador jug: Nombres){
            System.out.println(jug.getNombre());
        }
    }

}