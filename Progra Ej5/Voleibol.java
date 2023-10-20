//Estuardo Castro 23890
//Ejercicio 5
//Crear programa que sea capaz de registrar jugadores de Voleibol
//Y hacer ciertos cálculos, utilizando un CSV

//Existe un problema con mi programa y es que me tira errores 
//cuando intento utilizar el constructor de las efectiidades
//Por favor tomenlo en cuenta =)
//Considero que si se llega a arreglar, el programa funciona

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Voleibol{
    public static void main(String[] args){

        //Variables para el menú
        String opcion;
        Boolean Seguir = true;
        Scanner s = new Scanner(System.in);

        //Lista que almacenará a todos los tipos de jugadores
        ArrayList<Jugador> Jugadores = new ArrayList<Jugador>();

        //Variables para agregar jugadores
        String nombre = "";
        String pais = "";
        int error = 0;
        int ace = 0;
        int servicio = 0;
        int rec = 0;
        int pase = 0;
        int finta = 0;
        int ataq = 0;
        int bloqefec = 0;
        int bloqmal = 0;

        while(Seguir == true){
            Menu();
            opcion = s.nextLine();

            //Ejecuta el menú, según lo seleccionado
            switch(opcion){
                case("0"):

                    //Verifica que exista algún jugador registrado.
                    if(Jugadores.size() != 0){
                        for (Jugador jug: Jugadores){
                            System.out.println(jug.getNombres());
                        }

                    //En caso que no existan jugadores, mostará el siguiente mensaje.
                    } else{
                        System.out.println("\nAún no hay jugadores inscritos\n");
                    }
                    break;

                //Mostrar los 3 mejores líberos
                case("1"):
                    //Sortea a los jugadores según la efectividad del líbero.
                    Jugadores.sort(Jugadores.EfecLib());
                    for(int i = 0; i<4; i++){
                        System.out.println("\nLos 3 mejores jugadores son:");
                        System.out.println(i + ". " + Jugadores.get(i).getNombres() + ": " + Jugadores.get(i).EfecLib());
                    }
                    break;

                //Mostrar los pasadores que tengan más de 80% de efectividad
                case("2"):
                    System.out.println("Los siguiente extremos poseen más de 85 de efectividad");
                    for (Jugador Pas: Jugadores){
                        if(Pas.EfecPas() > 85){
                            System.out.println(Pas.getNombres() + ": " + Pas.EfecPas());
                        }
                    }
                    break;
                
                //Agregar jugadores
                case("3"):
                    System.out.println("\nIngrese la dirección del CSV\n");
                    break;
                
                //Agregar jugadores manualmente y que se agreguen al CSV.
                case("4"):
                    System.out.println("\nSi alguna de las opciones no tiene que ver con su tipo de jugador, por favor ingrese 0");
                    System.out.println("¿Cómo se llama su jugador?");
                    nombre = s.nextLine();

                    System.out.println("¿De qué país es?");
                    pais = s.nextLine();

                    System.out.println("¿Cuántos errores ha tenido?");
                    error = s.nextInt();

                    System.out.println("¿Cuántos aces ha hecho?");
                    ace = s.nextInt();

                    System.out.println("¿Cuántos servicios ha realizado?");
                    servicio = s.nextInt();

                    System.out.println("¿Cuántos recibos efectivos ha hecho?");
                    rec = s.nextInt();

                    System.out.println("¿Cuántos pases ha dado?");
                    pase = s.nextInt();

                    System.out.println("¿Cuántas fintas ha hecho?");
                    finta = s.nextInt()

                    System.out.println("¿Cuántos ataques ha hecho?");
                    ataq = s.nextInt();

                    System.out.println("¿Cuántos bloqueos efectivos ha tenido?");
                    bloqefec = s.nextInt();

                    System.out.println("¿Cuántos bloqueos ha hecho que no hayan salido bien?");
                    bloqmal = s.nextInt();

                    break;

                //Salir del programa
                case("5"):
                    System.out.println("\nMuchas gracias por haber usado este registro de jugadores");
                    System.out.println("Esperamos haya sido de su agrado 🤗");
                    Seguir = false;
                    break;

                //Por si ingresan algún valor que no sea válido.
                default:
                    System.out.println("Ingresó una opción inválida, pruebe de nuevo");
                    break;
            }
        }
    }

    //Constructor del Menú
    public static void Menu(){
        System.out.println("\nBienvenido, ¿Qué desea ver?\n");
        System.out.println("0. Mostrar todos los jugadores");
        System.out.println("1. Los 3 mejores líberos");
        System.out.println("2. Pasadores con más de 80% de efectividad");
        System.out.println("3. Cargar CSV");
        System.out.println("4. Agregar jugador");
        System.out.println("5. Salir\n");
    }
}