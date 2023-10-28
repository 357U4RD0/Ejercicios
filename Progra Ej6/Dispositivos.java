// Utilizaré la calse Dispositivos como una interfaz, para que funcione de manera adecuada el polimorfosis
// Aquí nomás estaré nombrando los métodos en común que usaré en Telefono y Computadora 
interface Dispositivos {
    void encender();
    void apagar();
    boolean estaEncendido();
    void MostrarInfo();
}
