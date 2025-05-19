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

}
