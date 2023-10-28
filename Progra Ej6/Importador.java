import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//Creé esta clase exclusivamente para que los datos que se importen del CSV al programa se asigne de manera automática a su objeto correspondiente
//Por cierto, se espera que el formato del CSV sea algo así
//Tipo,Marca,Modelo
public class Importador {
    public static List<Dispositivos> importar(String archivo) {
        List<Dispositivos> dispositivos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                String tipo = campos[0];
                String marca = campos[1];
                String modelo = campos[2];

                if (tipo.equals("Telefono")) {
                    Telefono telefono = new Telefono(modelo);
                    dispositivos.add(telefono);
                } else if (tipo.equals("Computadora")) {
                    Computadora computadora = new Computadora(marca);
                    dispositivos.add(computadora);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al importar dispositivos desde el archivo: " + e.getMessage());
        }
        return dispositivos;
    }
}