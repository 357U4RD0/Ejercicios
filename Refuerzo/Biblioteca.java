//Estuardo Castro 23890
//Refuerzo
//Automatizar ciertas acciones de una biblioteca

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> Clientes = new ArrayList<Cliente>();
        ArrayList<Articulo> Articulos = new ArrayList<Articulo>();
        ArrayList<Libro> Libros = new ArrayList<Libro>();
        ArrayList<Revista> Revistas = new ArrayList<Revista>();

        String opcion = "";
        String opcion2 = "";
        boolean seguir = true;
        int IdCliente = 0;
        String nombreCliente = "";
        String departamento = "";
        int CantPubl = 0;
        
        while(seguir){
            Menu1();
            opcion = sc.nextLine();

            switch(opcion){
                
                //Agregar un nuevo cliente a la biblioteca
                case "0":
                    System.out.println("¿Qué ID tiene?");
                    IdCliente = sc.nextInt();

                    System.out.println("¿Cómo se llama?");
                    nombreCliente = sc.nextLine();

                    System.out.println("¿En qué departamento vive?");
                    departamento = sc.nextLine();

                    System.out.println("¿Cuántas publicaciones ha hecho?");
                    CantPubl = sc.nextInt();

                    Clientes.add(new Cliente(IdCliente, nombreCliente, departamento, CantPubl));
                    break;

                //Solicitar un préstamo
                case "1":
                    MenuTipos();
                    opcion2 = sc.nextLine();
                    switch(opcion2){
                        case "0":
                        for (int i = 0; i < Libros.size(); i++) {
                            System.out.println("\u001B[34m" + i + " - " + Libros.get(i).getID() + ": " + Revistas.get(i).getTitulo());
                        }
                            break;

                        case "1":
                        for (int i = 0; i < Articulos.size(); i++) {
                            System.out.println("\u001B[34m" + i + " - " + Articulos.get(i).getID() + ": " + Revistas.get(i).getTitulo());
                        }
                            break;

                        case "2":
                        for (int i = 0; i < Revistas.size(); i++) {
                            System.out.println("\u001B[34m" + i + " - " + Revistas.get(i).getID() + ": " + Revistas.get(i).getTitulo());
                        }
                            break;
                    }
                    break;

                //Alargar el plazo
                case "2":
                    
                    break;

                //Cerrar
                case "3":
                    System.out.println("Muchas gracias por haber usado esta biblioteca 🫠👍");
                    break;

                //Por si se ingresa una opción no válida
                default:
                    System.out.println("\nEsa opción no está disponible, pruebe con otra\n");
                    break;
            }
        sc.close();
        }
        
    }

    private static void Menu1() {
        System.out.println("\nSeleccione una opción\n");
        System.out.println("0. Agregar cliente");
        System.out.println("1. Solicitar préstamo");
        System.out.println("2. Alargar solicitud");
        System.out.println("3. Salir\n");
    }

    private static void MenuTipos(){
        System.out.println("\n¿Qué tipo desea apartar?\n");
        System.out.println("0. Libro");
        System.out.println("1. Artículo");
        System.out.println("2. Revista\n");
    }
}