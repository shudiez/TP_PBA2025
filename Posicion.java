package tp1_pba;

//clase auxiliar que contiene una posicion en X , Y
public class Posicion {

    //atributos
    private int x;
    private int y;

    //constructor 
    public Posicion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters 
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //Setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean esIgual(Posicion otraPosicion) {
        return this.x == otraPosicion.x && this.y == otraPosicion.y;

    }

    public int distancia(Posicion otraPosicion) {
        int dx = Math.abs(this.x - otraPosicion.x);
        int dy = Math.abs(this.y - otraPosicion.y);
        return dx + dy;
    }

}
