//Estuardo Castro 23890
//27.10.2023
//Crear un programa que sea capaz de analizar ciertas cosas de computadoras o teléfonos
//Los datos serán brindados por un CSV

import java.util.ArrayList;
import java.util.List;

public class ElectroTech {
    public static void main(String[] args) {
        // Crear objetos de prueba
        Telefono telefono = new Telefono("Samsung Galaxy S23 Ultra");
        Computadora computadora = new Computadora("Alienware");

        // Guardar los dispositivos en un archivo CSV
        List<Dispositivos> dispositivos = new ArrayList<>();
        dispositivos.add(telefono);
        dispositivos.add(computadora);
        CSV.guardarCSV(dispositivos, "dispositivos.csv");
        
        // Importar dispositivos del archivo CSV y agregarlos a la lista
        List<Dispositivos> dispositivosImportados = Importador.importar("dispositivos.csv");
        dispositivos.addAll(dispositivosImportados);

        // Mostrar la info del teléfono o compu ya cargados.
        for (int i = 0; i < dispositivos.size(); i++) {
            System.out.println("\n" + dispositivos.get(i).MostrarInfo());
        }

        // Ver cuáles dispositivos se encuentran encendidos o apagados
        System.out.println("\n-----------------------Los Dispositivos se encuentran:-----------------------\n");
        if (telefono.estaEncendido()) {
            System.out.println("El teléfono está encendido.\n");
        } else {
            System.out.println("El teléfono está apagado.\n");
        }
        if (computadora.estaEncendido()) {
            System.out.println("La computadora está encendida.\n");
        } else {
            System.out.println("La computadora está apagada.\n");
        }

        // Aquí cargará la información, aparte de mostrar los dispositivos nuevos
        List<Dispositivos> Cargados = CSV.cargarCSV("dispositivos.csv");
        for (Dispositivos dispositivo : Cargados) {
            System.out.println(dispositivo.MostrarInfo());
        }
    }
}