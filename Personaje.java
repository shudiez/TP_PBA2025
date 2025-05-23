package tp1_pba;

//Clase abstracta: Base para todos los personajes
public abstract class Personaje {

    protected String nombre;
    protected int vida;
    protected boolean estaVivo;
    protected char inicial;
    protected Posicion posicion;

    //Constructor
    public Personaje(String nombre, int vida, boolean estaVivo, char inicial, Posicion posicion) {
        this.nombre = nombre;
        this.vida = vida;
        this.estaVivo = estaVivo;
        this.inicial = inicial;
        this.posicion = posicion;
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public char getInicial() {
        return inicial;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    //Metodos
    //metodo abstracto mover. Todos los personajes van a tenerlo
    public abstract void mover(string direccion);
    
}
