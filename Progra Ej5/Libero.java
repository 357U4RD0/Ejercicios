public class Libero extends Jugador {
    
    private int Recibos;

    //Objeto Líbero
    public Libero(String Nombre, String Pais, int Errores, int Aces, int Servicios, int Recibos){
        super(Nombre, Pais, Errores, Aces, Servicios);
        this.Recibos = Recibos;
    }

    //Efectividad (En el análisis puse sin querer que era void)
    public float EfecLib(){
        float x = (this.Recibos - this.Errores);
        float y = (this.Recibos + this.Errores);
        return ((x * 100 / y) + ((this.Aces * 100) / this.Servicios));
    }

    //Posible getter
    public int getRecibos(){
        return this.Recibos;
    }
}
