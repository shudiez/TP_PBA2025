package tp1_pba;

//Clase abstracta: Base para todos los personajes
public abstract class Personaje {

    protected String nombre;
    protected int vida;
    protected char inicial;
    protected Posicion posicion;

    //Constructor
    public Personaje(String nombre, int vida, char inicial, Posicion posicion) {
        this.nombre = nombre;
        this.vida = 100;
        this.inicial = inicial;
        this.posicion = posicion;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public char getInicial() {
        return inicial;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    //Metodos
    //metodo abstracto mover. Todos los personajes van a tenerlo
    public abstract void mover(String direccion, Mapa mapa);

    //METODO PARA RECIBIR DAÑO
    public void recibirDanio(int cantidad) {
        vida = vida - cantidad;
        if (vida <= 0) {
            vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }
}
