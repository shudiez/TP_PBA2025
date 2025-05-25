package tp1_pba;

public class Objeto {

    private String tipo;
    private Posicion posicion;
    private char inicial;

    //Constructor
    public Objeto(String tipo, Posicion posicion, char inicial) {
        this.tipo = tipo;
        this.posicion = posicion;
        this.inicial = inicial;
    }

    //Getters 
    public String getTipo() {
        return tipo;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public char getInicial() {
        return inicial;
    }

    //Metodos
    public void recoger() {
    }
}
