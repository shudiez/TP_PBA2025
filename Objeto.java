public class Objeto {
    private String nombre;
    private char inicial;

    //CONSTRUCTOR
    public Objeto(String nombre, char inicial) {
        this.nombre = nombre;
        this.inicial = inicial;
    }

    //GETTERS 
    public String getNombre() {
        return nombre;
    }

    public char getinicial() {
        return inicial;
    }
}
