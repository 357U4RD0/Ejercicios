public class Pasador extends Jugador {
    
    private int Pases;
    private int Fintas;

    //Objeto Pasador
    public Pasador(String Nombre, String Pais, int Errores, int Aces, int Servicios, int Pases, int Fintas){
        super(Nombre, Pais, Errores, Aces, Servicios);
        this.Pases = Pases;
        this.Fintas = Fintas;
    }

    //Efectividad (También puse que es void en vez de float)
    public float EfecPas(){
        float x = (this.Pases + this.Fintas - this.Errores);
        float y = (this.Pases + this.Fintas + this.Errores);
        return ((x * 100 / y) + ((this.Aces * 100) / this.Servicios));
    }

    //Posibles getters
    public int getPases(){
        return this.Pases;
    }

    public int getFintas(){
        return this.Fintas;
    }
}
