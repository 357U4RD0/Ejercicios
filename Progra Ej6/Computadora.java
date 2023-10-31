public class Computadora implements Dispositivos {

    private String marca;
    private boolean encendido;

    //Objeto Computadora
    public Computadora(String marca) {
        this.marca = marca;
        this.encendido = false;
    }

    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public boolean estaEncendido() {
        return this.encendido;
    }

    public String MostrarInfo() {
        String x = ("Tipo: Teléfono");
        String y = ("Marca: " + marca);
        return x + y;
    }
}