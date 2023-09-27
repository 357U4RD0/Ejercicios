//Estuardo Castro 23890
//Ejercicio #4 
//En este programa, se analizarán los datos de los jugadores de balonmano, dando ciertas estadísticas.

//En el análisis y diseño agregué en cada clase los arraylists para guardar los nombres de los jugadores.
//Pero pensé que sería mejor idea guardar en el main esos Arrays.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Balonmano {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Jugador> Nombres = new ArrayList<Jugador>();
        ArrayList<Extremo> Extremos = new ArrayList<Extremo>();
        ArrayList<Portero> Porteros = new ArrayList<Portero>();

        //Los jugadores que usaré son reales (Cabe mencionar que son de fut)
        //Los tiros los inventaré, multiplicaré x1.5 los goles
        //Las faltas y pases los inventaré
        //Las paradas de los porteros, multiplicaré por 3.5 las veces que dejó en blanco su portería.
        //Para los extremos, colocaré el nombre de delanteros, sin importar si son 9.
        Jugador Maldini = new Jugador("Paolo Maldini", "Italia", 90, 33, 50);
        Jugador Pogba = new Jugador("Paul Pogba", "Francia", 140, 76, 114);
        Jugador Puyol = new Jugador("Carles Puyol", "España", 210, 26, 39);
        Jugador Iniesta = new Jugador("Andrés Iniesta", "España", 100, 103, 155);
        Jugador Zidane = new Jugador("Zinedine Zidane", "Francia", 180, 156, 234);
        Jugador Cruyff = new Jugador("Johan Cruyff", "Países Bajos", 85, 328, 492);
        Jugador Xavi = new Jugador("Xavi Hernández", "España", 100, 103, 155);
        
        Extremo Messi = new Extremo("Lionel Messi", "Argentina", 142, 819, 1229, 18970, 362);
        Extremo Lewandowski = new Extremo("Robert Lewandoski", "Polonia", 135, 629, 944, 13095, 179);
        Extremo Basten = new Extremo("Van Basten", "Países Bajos", 40,301,452,5595,91);
        Extremo Stefano = new Extremo("Alfredo Di Stéfano", "Argentina", 30, 454, 681, 2478, 3);
        Extremo Suarez = new Extremo("Luis Suarez", "Uruguay", 270, 529, 794, 11596, 297);
        Extremo Nazario = new Extremo("Ronaldo Nazario", "Brasil", 65, 365, 548, 6083, 101);
        Extremo Cristiano = new Extremo("Cristiano Ronaldo", "Portugal", 186, 853, 1280, 14124, 274);
        
        Portero Cech = new Portero("Petr Cech", "República Checa", 3, 0, 1, 1194, 695);
        Portero Casillas = new Portero("Iker Casillas", "España", 40, 0, 1, 1540, 960);
        Portero Neuer = new Portero("Manuel Neuer", "Alemania", 30, 0, 1, 1365, 738);
        Portero Buffon = new Portero("Gianluigi Buffon", "Italia", 25, 0, 1, 1771, 971);
        Portero Kahn = new Portero("Oliver Kahn", "Alemania", 55, 0, 1, 1227, 881);
        Portero Sar = new Portero("Edwin Van der Sar", "Países Bajos", 25, 1, 2, 1540, 805);
        Portero Zamora = new Portero("Ricardo Zamora", "España", 4, 0, 2, 344, 213);

        //Agregar los jugadores a los arrays
        Nombres.add(Maldini);
        Nombres.add(Pogba);
        Nombres.add(Puyol);
        Nombres.add(Iniesta);
        Nombres.add(Zidane);
        Nombres.add(Cruyff);
        Nombres.add(Xavi);

        Extremos.add(Messi);
        Extremos.add(Lewandowski);
        Extremos.add(Basten);
        Extremos.add(Stefano);
        Extremos.add(Suarez);
        Extremos.add(Nazario);
        Extremos.add(Cristiano);

        Porteros.add(Cech);
        Porteros.add(Casillas);
        Porteros.add(Neuer);
        Porteros.add(Buffon);
        Porteros.add(Kahn);
        Porteros.add(Sar);
        Porteros.add(Zamora);

        //Variables que usaré para el menú
        boolean seguir = true;
        boolean seguir2 = true;
        String opcion = "";
        String opcion2 = "";
        String Nombre = "";
        String Pais = "";
        int falta = 0;
        int gol = 0;
        int lanzamiento = 0;
        int parada = 0;
        int goles_r = 0;
        int pase = 0;
        int asistencia = 0;

        //Inicio del menú
        while (seguir){
            System.out.println("");
            System.out.println("Elija qué opción desea");
            System.out.println("");
            System.out.println("0. Ver los jugadores");
            System.out.println("1. Ver los 3 mejores porteros");
            System.out.println("2. Ver los jugadores que posean más de 85 de efectividad");
            System.out.println("3. Registrar nuevo jugador");
            System.out.println("4. Salir");
            System.out.println("");

            opcion = sc.nextLine();

            switch (opcion) {
                case "0":
                    System.out.println("-------------------Jugadores----------------------------");
                    System.out.println("");
                    for (Jugador jug: Nombres){
                        System.out.println(jug.getNombre());
                    }

                    //Resulta que todos los "extremos" quedaron con una efectividad bastante parecida
                    System.out.println("");
                    System.out.println("----------------------Extremos-----------------------------");
                    System.out.println("");
                    for (Extremo ext: Extremos){
                        System.out.println(ext.getNombre());
                    }

                    System.out.println("");
                    System.out.println("---------------------Porteros-----------------------");
                    System.out.println("");
                    for (Portero por: Porteros){
                        System.out.println(por.getNombre());
                    }

                    break;
                
                case "1":
                    List<Float> eficiencias = new ArrayList<>();
                    for (Portero porte : Porteros) {
                        eficiencias.add(porte.EfecPor());
                    }

                    // Ordenar la lista completa de jugadores por eficiencia en orden descendente
                    Collections.sort(Porteros, new Comparator<Portero>() {
                        @Override
                        public int compare(Portero j1, Portero j2) {
                            float eficiencia1 = j1.EfecPor();
                            float eficiencia2 = j2.EfecPor();
                            return Float.compare(eficiencia2, eficiencia1);
                        }
                    });

                    // Mostrar los 3 jugadores con la eficiencia más alta
                    System.out.println("Los 3 jugadores con la eficiencia más alta son:");
                    for (int i = 0; i < Math.min(3, Porteros.size()); i++) {
                        Portero po = Porteros.get(i);
                        float eficiencia = eficiencias.get(i);
                        System.out.println(po.getNombre() + " - Eficiencia: " + eficiencia);
                    }
  
                    break;
                
                case "2":
                    System.out.println("Los siguiente extremos poseen más de 85 de efectividad");
                    for (Extremo extr: Extremos){
                        if(extr.EfecExt() > 85){
                            System.out.println(extr.getNombre() + ": " + extr.EfecExt());
                        }
                    }
                    break;

                case "3":
                    //Crearé un nuevo menú para el registro de jugadores.
                    //No me dejaban muy en claro si es que pedían reistro de jugadores.
                    //En la explicación decía que si, pero luego en lo que debía de hacer el programa, no lo decían.
                    while(seguir2){
                        System.out.println("");
                        System.out.println("¿Qué tipo de jugador desea de registrar?");
                        System.out.println("");
                        System.out.println("0. Jugador");
                        System.out.println("1. Extremo");
                        System.out.println("2. Portero");
                        System.out.println("3. Salir");
                        System.out.println("");

                        opcion2 = sc.nextLine();
                        switch (opcion2) {
                            case "0":
                                System.out.println("¿Cómo se llama su jugador?");
                                Nombre = sc.nextLine();

                                System.out.println("¿De qué país viene?");
                                Pais = sc.nextLine();

                                System.out.println("¿Cuántas faltas ha cometido?");
                                falta = sc.nextInt();
                                
                                System.out.println("¿Cuántos goles ha metido?");
                                gol = sc.nextInt();

                                System.out.println("¿Cuántos tiros ha hecho?");
                                lanzamiento = sc.nextInt();

                                Nombres.add(new Jugador(Nombre, Pais, falta, gol, lanzamiento));
                                break;
                            
                            case "1":
                                System.out.println("¿Cómo se llama su extremo?");
                                Nombre = sc.nextLine();

                                System.out.println("¿De qué país viene?");
                                Pais = sc.nextLine();

                                System.out.println("¿Cuántas faltas ha cometido?");
                                falta = sc.nextInt();
                                
                                System.out.println("¿Cuántos goles ha metido?");
                                gol = sc.nextInt();

                                System.out.println("¿Cuántos tiros ha hecho?");
                                lanzamiento = sc.nextInt();

                                System.out.println("¿Cuántos pases ha hecho?");
                                pase = sc.nextInt();

                                System.out.println("¿Cuántas asistencias ha dado?");
                                asistencia = sc.nextInt();

                                Extremos.add(new Extremo(Nombre, Pais, falta, gol, lanzamiento, pase, asistencia));
                                break;
                            
                            case "2":
                                System.out.println("¿Cómo se llama su arquero?");
                                Nombre = sc.nextLine(); 

                                System.out.println("¿De qué país viene?");
                                Pais = sc.nextLine();

                                System.out.println("¿Cuántas faltas ha cometido?");
                                falta = sc.nextInt();
                                
                                System.out.println("¿Cuántos goles ha metido?");
                                gol = sc.nextInt();

                                System.out.println("¿Cuántos tiros ha hecho?");
                                lanzamiento = sc.nextInt();

                                System.out.println("¿Cuántas paradas ha hecho?");
                                parada = sc.nextInt();

                                System.out.println("¿Cuántos goles ha recibido?");
                                goles_r = sc.nextInt();

                                Porteros.add(new Portero(Nombre, Pais, falta, gol, lanzamiento, parada, goles_r));
                                break;
                            
                            case "3":
                                System.out.println("Volvemos con el menú principal =P");
                                seguir2 = false;
                                seguir = true;
                                break;
                        
                            default:
                                System.out.println("Ingresó una opción inválida, pruebe de nuevo");
                                break;
                        }
                    }

                case "4":
                    System.out.println("Muchas gracias por usar el registro 😉👍");
                    seguir = false;
                    break;

                default:
                    System.out.println("Ingresó una opción inválida, pruebe de nuevo");
                    break;
            }
        }
    }

}