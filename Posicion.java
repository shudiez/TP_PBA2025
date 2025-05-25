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

    //Getters y setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
