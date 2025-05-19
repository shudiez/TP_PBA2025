package tp1_pba;

public class Posicion {

    //atributos
    private int jugadorEnPosicionN;
    private int jugarorEnPosicionM;

    //Getters y setters
    public int getJugadorEnPosicionN() {
        return jugadorEnPosicionN;
    }

    public void setJugadorEnPosicionN(int jugadorEnPosicionN) {
        this.jugadorEnPosicionN = jugadorEnPosicionN;
    }

    public int getJugarorEnPosicionM() {
        return jugarorEnPosicionM;
    }

    public void setJugarorEnPosicionM(int jugarorEnPosicionM) {
        this.jugarorEnPosicionM = jugarorEnPosicionM;
    }

    //constructor 
    public Posicion(int jugadorEnPosicionN, int jugarorEnPosicionM) {
        this.jugadorEnPosicionN = jugadorEnPosicionN;
        this.jugarorEnPosicionM = jugarorEnPosicionM;
    }
//metodo avanzar()
    public void avanzar(){
        this.jugadorEnPosicionN++;
    }
//Metodo retroceder()
     public void retroceder(){
        this.jugadorEnPosicionN--;
    }
    @Override
    public String toString() {
        return "(" + jugadorEnPosicionN + "," + jugadorEnPosicionN + ").";
    }
    
}
