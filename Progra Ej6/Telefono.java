class Telefono implements Dispositivos {
    private String modelo;
    private boolean encendido;

    public Telefono(String modelo) {
        this.modelo = modelo;
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
        System.out.println("Tipo: Teléfono");
        System.out.println("Marca: " + modelo);
    }
}