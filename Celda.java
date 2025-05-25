package tp1_pba;

//Una celda por cada celda que tenga el mapa
public class Celda {

    private char inicial; //Para S,*,G,C,P,L
    private boolean cerrada;

    //CONSTRUCTOR
    public Celda(char inicial, boolean cerrada) {
        this.inicial = inicial;
        this.cerrada = false;
    }

    //Getters
    public char getInicial() {
        return inicial;
    }

    //Setters
    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    public boolean isCerrada() {
        return cerrada;
    }

    //Metodos
    public void cerrar() {
        this.cerrada = true;
    }

    public void abrir() {
        this.cerrada = false;
    }
}
