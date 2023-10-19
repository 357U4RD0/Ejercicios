public class AuxOp extends Jugador {
    
    private int Ataques;
    private int BloqueosEfec;
    private int BloqueosMal;

    //Crear objeto AuxOp
    public AuxOp(String Nombre, String Pais, int Errores, int Aces, int Servicios, int Ataques, int BloqueosEfec, int BloqueosMal){
        super(Nombre, Pais, Errores, Aces, Servicios);
        this.Ataques = Ataques;
        this.BloqueosEfec = BloqueosEfec;
        this.BloqueosMal = BloqueosMal;
    }

    //Efectividad (lo mismo 😅)
    public float EfecAuxOp(){
        float x = (this.Ataques + this.BloqueosEfec - this.BloqueosMal - this.Errores);
        float y = (this.Ataques + this.BloqueosEfec + this.BloqueosMal + this.Errores);
        return ((x * 100 / y) + ((this.Aces * 100) / this.Servicios));
    }

    //Posibles getters
    public int getAtaques(){
        return this.Ataques;
    }

    public int getBloqueosEfec(){
        return this.BloqueosEfec;
    }

    public int getBloqueosMal(){
        return this.BloqueosMal;
    }
}
