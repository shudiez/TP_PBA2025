package tp1_pba;

public abstract class Personaje {

    protected String nombre_personaje;
    protected int vida_personaje;
    protected boolean estaVivoONo;
    protected char inicial_personaje;
    protected Posicion posicion_personaje;

    //Constructor
    public Personaje(String nombre_personaje, int vida_personaje, boolean estaVivoONo, char inicial_personaje, Posicion posicion_personaje) {    
        this.nombre_personaje = nombre_personaje;
        this.vida_personaje = vida_personaje;
        this.estaVivoONo = estaVivoONo;
        this.inicial_personaje = inicial_personaje;
        this.posicion_personaje = posicion_personaje;
    }

    //Getters and setters

    public String getNombre_personaje() {
        return nombre_personaje;
    }

    public void setNombre_personaje(String nombre_personaje) {
        this.nombre_personaje = nombre_personaje;
    }

    public int getVida_personaje() {
        return vida_personaje;
    }

    public void setVida_personaje(int vida_personaje) {
        this.vida_personaje = vida_personaje;
    }

    public boolean isEstaVivoONo() {
        return estaVivoONo;
    }

    public void setEstaVivoONo(boolean estaVivoONo) {
        this.estaVivoONo = estaVivoONo;
    }

    public char getInicial_personaje() {
        return inicial_personaje;
    }

    public void setInicial_personaje(char inicial_personaje) {
        this.inicial_personaje = inicial_personaje;
    }

    public Posicion getPosicion_personaje() {
        return posicion_personaje;
    }

    public void setPosicion_personaje(Posicion posicion_personaje) {
        this.posicion_personaje = posicion_personaje;
    }
    
    
    //Metodos
    public abstract void mover();
}
