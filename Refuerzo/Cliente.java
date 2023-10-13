public class Cliente {
    
    int Prestamos = 5;
    int IDCliente;
    String NombreCliente;
    //Para este, para que no sea muy complicado, lo voy a tomar como departamento
    String Dirección;
    int Publicaciones;

    public Cliente(int IDCliente, String NombreCliente, String Dirección, int Publicaciones){
        Prestamos = 5;
        this.IDCliente = IDCliente;
        this.NombreCliente = NombreCliente;
        this.Dirección = Dirección;
        this.Publicaciones = Publicaciones;
    }

    public int getPrestamos(){
        return this.Prestamos;
    }

    public int getIDCliente(){
        return this.IDCliente;
    }

    
}
