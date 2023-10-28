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

    public void MostrarInfo() {
        System.out.println("Tipo: Computadora");
        System.out.println("Marca: " + marca);
    }
}