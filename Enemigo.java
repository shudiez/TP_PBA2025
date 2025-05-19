package tp1_pba;

public interface Enemigo {

    public void patrullar(char[][] mapa); //Patrullar el mapa

    public boolean capturar(int jugadorEnPosicionN, int jugadorEnPosicionM);

}
