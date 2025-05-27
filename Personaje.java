public abstract class Personaje {
    protected String nombre;
    protected int vida;
    protected Posicion posicion;
    protected char inicial;

    //CONSTRUCTOR
    public Personaje(String nombre, int vida, char inicial, Posicion posicion) {
        this.nombre = nombre;
        this.vida = vida;
        this.inicial = inicial;
        this.posicion = posicion;
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public char getinicial() {
        return inicial;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    //METODOS
    public abstract void mover(Mapa mapa, String direccion);

    public boolean estaVivo() {
        return vida > 0;
    }
}

