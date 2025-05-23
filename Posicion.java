package tp1_pba;

//clase auxiliar que contiene una posicion en X , Y
public class Posicion {

    //atributos
    private int posicionX;
    private int posicionY;

    //Getters y setters
    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    //constructor 
    public Posicion(int posicionX, int posicionY) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
//metodo avanzar()

    public void avanzar() {
        this.posicionX++;
    }
//Metodo retroceder()

    public void retroceder() {
        this.posicionX--;
    }

//Metodo toString()
    @Override
    public String toString() {
        return "(" + posicionX + "," + posicionY + ").";
    }

}
