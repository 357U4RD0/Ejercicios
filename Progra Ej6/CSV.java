import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSV {
    // Aquí guardaré los dispositivos en el CSV
    public static void guardarCSV(List<Dispositivos> dispositivos, String archivo) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivo))) {
            for (Dispositivos dispositivo : dispositivos) {
                writer.println(dispositivo.getClass().getSimpleName() + "," + dispositivo.estaEncendido());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Con este método considero cargar los dispositivos del CSV al programa
    public static List<Dispositivos> cargarCSV(String archivo) {
        List<Dispositivos> dispositivos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(",");
                String tipo = campos[0];
                boolean encendido = Boolean.parseBoolean(campos[1]);

                if (tipo.equals("Telefono")) {
                    dispositivos.add(new Telefono("Desconocido"));
                } else if (tipo.equals("Computadora")) {
                    dispositivos.add(new Computadora("Desconocido"));
                }
                dispositivos.get(dispositivos.size() - 1).encender();

                if (!encendido) {
                    dispositivos.get(dispositivos.size() - 1).apagar();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return dispositivos;
    }
}