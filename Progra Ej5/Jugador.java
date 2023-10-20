public class Jugador {

    //Declaración de variables
    protected String Nombre;
    protected String Pais;
    protected int Errores;
    protected int Aces;
    protected int Servicios;

    //Crear clase jugador
    public Jugador(String Nombre, String Pais, int Errores, int Aces, int Servicios){
        this.Nombre = Nombre;
        this.Pais = Pais;
        this.Errores = Errores;
        this.Aces = Aces;
        this.Servicios = Servicios;
    }

    //Getters que probablemente usaré
    public String getNombres(){
        return this.Nombre;
    }
    
    public int getErrores(){
        return this.Errores;
    }

    public int getAces(){
        return this.Aces;
    }

    public int getServicios(){
        return this.Servicios;
    }
}
